package nl.tue.win.jgxl.dataframesupport;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Edges extends HashSet<Edge> {
    @Override
    public String toString() {
        LinkedHashSet<String> attrKeys = this.stream()
                .flatMap(e -> e.keySet().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Comparator<Edge> bySource = Comparator.comparing(e -> e.getSource().getId());
        Comparator<Edge> byTarget = Comparator.comparing(e -> e.getTarget().getId());
        Comparator<Edge> byLabel = Comparator.comparing(Edge::getInteraction);
        return String.format("source,target,%s\n%s", String.join(",", attrKeys), this.stream()
                .sorted(bySource.thenComparing(byTarget).thenComparing(byLabel))
                .map(e -> String.format("%s,%s,%s", e.getSource().getId(), e.getTarget().getId(),
                        attrKeys.stream()
                                .map(k -> {
                                    String s = e.getOrDefault(k, "").toString();
                                    if (s.contains(",")) {
                                        s = String.format("\"%s\"", s.replaceAll("\"", "\\\""));
                                    }
                                    return s;
                                })
                                .collect(Collectors.joining(","))))
                .collect(Collectors.joining("\n")));
    }
}
