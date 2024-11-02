package knot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a node in the knot graph.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class KnotNode {
    private final String label; // Label of the node
    private final List<KnotEdge> edges; // List of edges connected to this node
    private int x; // X coordinate for visualization
    private int y; // Y coordinate for visualization

    /**
     * Constructs a KnotNode with the specified label and initial coordinates.
     *
     * @param label The label of the node.
     * @param x     The x-coordinate of the node for visualization.
     * @param y     The y-coordinate of the node for visualization.
     */
    public KnotNode(String label, int x, int y) {
        this.label = label;
        this.edges = new ArrayList<>();
        this.x = x; // Initialize x-coordinate
        this.y = y; // Initialize y-coordinate
    }

    /**
     * Adds an edge to the node.
     *
     * @param edge The edge to add.
     */
    public void addEdge(KnotEdge edge) {
        edges.add(edge); // Add the edge to the list
    }

    /**
     * Removes an edge from the node.
     *
     * @param edge The edge to remove.
     */
    public void removeEdge(KnotEdge edge) {
        edges.remove(edge); // Remove the edge from the list
    }

    /**
     * Returns the label of the node.
     *
     * @return The label of the node.
     */
    public String getLabel() {
        return label; // Return the label of the node
    }

    /**
     * Returns all edges connected to the node.
     *
     * @return A list of edges connected to the node.
     */
    public List<KnotEdge> getEdges() {
        return edges; // Return all edges connected to the node
    }

    /**
     * Gets the x-coordinate of the node.
     *
     * @return The x-coordinate of the node.
     */
    public int getX() {
        return x; // Return the x-coordinate
    }

    /**
     * Gets the y-coordinate of the node.
     *
     * @return The y-coordinate of the node.
     */
    public int getY() {
        return y; // Return the y-coordinate
    }

}
