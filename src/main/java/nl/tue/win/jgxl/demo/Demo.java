package nl.tue.win.jgxl.demo;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import javafx.util.Pair;
import nl.tue.win.jgxl.AttrType;
import nl.tue.win.jgxl.EdgeType;
import nl.tue.win.jgxl.GxlType;
import nl.tue.win.jgxl.NodeType;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    private static Stream<Pair<String,String>> extractAttributes(Stream<AttrType> attributes) {
        return attributes.map(attr -> {
            if (attr.getName().equalsIgnoreCase("label") && attr.getString().contains(":")) {
                String[] attrs = attr.getString().split(":");
                if (attrs[0].strip().equalsIgnoreCase("let")) {
                    String[] attrs2 = attrs[1].split("=");
                    String key = attrs2[0].strip().split("\\s")[0];
                    String value = attrs2[1].strip();
                    if (value.startsWith("\"")) {
                        value = value.substring(1, value.length()-1);
                    }
                    return new Pair<>(key, value);
                } else {
                    return new Pair<>(attrs[0].strip(), attrs[1].strip());
                }
            } else {
                return new Pair<>(attr.getName(), attr.getString());
            }
        });
    }

    public static void main(String[] args) {
        try {

            JAXBContext context = JAXBContext.newInstance(GxlType.class);
            GxlType gxl = context.createUnmarshaller()
                    .unmarshal(
                            new StreamSource(new File("examples/jhotdraw.gst")),
                            GxlType.class)
                    .getValue();

            gxl.getGraph().forEach(g -> {

                List<NodeType> nodes = g.getNodeOrEdgeOrRel().stream().parallel()
                        .filter(el -> el instanceof NodeType)
                        .map(el -> (NodeType) el)
                        .collect(Collectors.toList());

                nodes.forEach(n -> {
                    String label = extractAttributes(n.getAttr().stream())
                            .map(p ->  String.format("'%s': '%s'", p.getKey(), p.getValue()))
                            .collect(Collectors.joining(", "));
                    System.out.printf("%s %s %s%n",
                            n.getId(),
                            n.getId(),
                            String.format("{ %s }", label));
                });

                List<EdgeType> edges = g.getNodeOrEdgeOrRel().stream().parallel()
                        .filter(el -> el instanceof EdgeType)
                        .map(el -> (EdgeType) el)
                        .collect(Collectors.toList());

                edges.forEach(e -> {
                    NodeType from = ((NodeType) e.getFrom());
                    NodeType to = ((NodeType) e.getTo());
                    String label = extractAttributes(e.getAttr().stream())
                            .map(p ->  String.format("'%s': '%s'", p.getKey(), p.getValue()))
                            .collect(Collectors.joining(", "));
                    System.out.printf("%s %s %s%n",
                            from.getId(),
                            to.getId(),
                            String.format("{ %s }", label));
                });
            });
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
