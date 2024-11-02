package knot;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a knot graph consisting of nodes and edges.
 */
public class KnotGraph {
    private final List<KnotNode> nodes; // List of nodes in the knot graph
    private final List<KnotEdge> edges; // List of edges in the knot graph

    public KnotGraph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    /**
     * Adds a node to the knot graph.
     * @param node The node to add.
     */
    public void addNode(KnotNode node) {
        nodes.add(node);
    }

    /**
     * Adds an edge between two specified nodes.
     * @param from The source node.
     * @param to The target node.
     * @param isOverCrossing True if the edge is an over crossing, false otherwise.
     */
    public void addEdge(KnotNode from, KnotNode to, boolean isOverCrossing, boolean doubleBound) {
        KnotEdge edge = new KnotEdge(from, to, isOverCrossing, doubleBound);
        edges.add(edge);
        from.addEdge(edge); // Add the edge to the source node's edge list
    }

    public List<KnotNode> getNodes() {
        return nodes; // Return all nodes
    }

    public List<KnotEdge> getEdges() {
        return edges; // Return all edges
    }
}





