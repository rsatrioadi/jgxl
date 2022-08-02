package nl.tue.win.jgxl.dataframesupport;

public class Graph {
    private final String id;
    private final Nodes nodes;
    private final Edges edges;

    public Graph(String id, Nodes nodes, Edges edges) {
        this.id = id;
        this.nodes = nodes;
        this.edges = edges;
    }

    public String getId() {
        return id;
    }

    public Nodes getNodes() {
        return nodes;
    }

    public Edges getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "Graph:" +
                "\n  Nodes:\n    " + nodes.toString().replaceAll("\n", "\n    ") +
                "\n  Edges:\n    " + edges.toString().replaceAll("\n", "\n    ") +
                "\n";
    }
}
