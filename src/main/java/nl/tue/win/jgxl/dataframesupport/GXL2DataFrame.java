package nl.tue.win.jgxl.dataframesupport;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import javafx.util.Pair;
import nl.tue.win.jgxl.AttrType;
import nl.tue.win.jgxl.EdgeType;
import nl.tue.win.jgxl.GxlType;
import nl.tue.win.jgxl.NodeType;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GXL2DataFrame {

    private static Stream<Pair<String, String>> extractAttributes(Stream<AttrType> attributes) {
        return attributes
                .map(attr -> {
                    if (attr.getName().equalsIgnoreCase("label") && attr.getString().contains(":")) {
                        String[] attrs = attr.getString().split(":", 2);
                        if (attrs[0].strip().equalsIgnoreCase("let")) {
                            String[] attrs2 = attrs[1].split("=", 2);
                            String key = attrs2[0].strip();
                            String value = attrs2[1].strip().replaceFirst("^\\w+:", "");
                            if (value.startsWith("\"")) {
                                value = value.substring(1, value.length() - 1);
                            }
                            return new Pair<>(key, value);
                        } else {
                            return new Pair<>(attrs[0].strip(), attrs[1].strip());
                        }
                    } else {
                        return new Pair<>(attr.getName(), attr.getString());
                    }
                })
                .filter(attr -> !attr.getKey().equals("layout"));
    }

    public static void main(String[] args) {
        try {

            String project = "jhotdrawcompacted";

            JAXBContext context = JAXBContext.newInstance(GxlType.class);
            GxlType gxl = context.createUnmarshaller()
                    .unmarshal(
                            new StreamSource(new File(String.format("examples/%s.gst", project))),
                            GxlType.class)
                    .getValue();

            int[] i = new int[1];
            gxl.getGraph().stream().map(g -> {

                Nodes nodeSet = new Nodes();

                List<NodeType> nodes = g.getNodeOrEdgeOrRel().stream()
                        .filter(el -> el instanceof NodeType)
                        .map(el -> (NodeType) el)
                        .collect(Collectors.toList());

                nodes.forEach(n -> {
                    Node node = nodeSet.stream()
                            .filter(n1 -> n1.getId().equals(n.getId()))
                            .findFirst()
                            .orElse(new Node(n.getId()));
                    extractAttributes(n.getAttr().stream())
                            .forEach(attr -> node.put(attr.getKey(), attr.getValue()));
                    nodeSet.add(node);
                });

                Edges edgeSet = new Edges();

                List<EdgeType> edges = g.getNodeOrEdgeOrRel().stream()
                        .filter(el -> el instanceof EdgeType)
                        .map(el -> (EdgeType) el)
                        .collect(Collectors.toList());

                edges.forEach(e -> {

                    String sourceId = ((NodeType) e.getFrom()).getId();
                    String targetId = ((NodeType) e.getTo()).getId();

                    String label = extractAttributes(e.getAttr().stream())
                            .filter(a -> a.getKey().equals("label"))
                            .map(Pair::getValue)
                            .findFirst()
                            .orElse("");

                    if (!sourceId.equals(targetId) || !label.isEmpty()) {

                        Optional<Node> oSource = nodeSet.stream()
                                .filter(n -> n.getId().equals(sourceId))
                                .findFirst();
                        Optional<Node> oTarget = nodeSet.stream()
                                .filter(n -> n.getId().equals(targetId))
                                .findFirst();

                        Node source = oSource.orElse(new Node(sourceId));
                        Node target = oTarget.orElse(sourceId.equals(targetId) ? source : new Node(targetId));

                        nodeSet.add(source);
                        nodeSet.add(target);

                        Edge edge = edgeSet.stream()
                                .filter(e1 ->
                                        e1.getSource() == source
                                                && e1.getTarget() == target
                                                && e1.getInteraction().equals(label))
                                .findFirst()
                                .orElse(new Edge(source, target, label));

                        edgeSet.add(edge);

                        extractAttributes(e.getAttr().stream())
                                .filter(attr -> !attr.getKey().equals("label"))
                                .forEach(attr -> edge.put(attr.getKey(), attr.getValue()));
                    } else {

                        Node node = nodeSet.stream()
                                .filter(n1 -> n1.getId().equals(sourceId))
                                .findFirst()
                                .orElse(new Node(sourceId));
                        extractAttributes(e.getAttr().stream())
                                .forEach(attr -> node.put(attr.getKey(), attr.getValue()));

                        nodeSet.add(node);
                    }
                });

                return new Graph(String.valueOf(i[0]++), nodeSet, edgeSet);
            }).forEach(g -> {
                try {
                    System.out.println(g);
                    Files.write(Path.of(String.format("output/%s-%s-nodes.csv", project, g.getId())),
                            g.getNodes().toString().getBytes());
                    Files.write(Path.of(String.format("output/%s-%s-edges.csv", project, g.getId())),
                            g.getEdges().toString().getBytes());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
