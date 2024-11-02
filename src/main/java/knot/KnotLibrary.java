package knot;

/**
 * A library for creating standard knot types.
 */
public class KnotLibrary {

    /**
     * Creates a Figure-Eight knot.
     * @return A KnotGraph representing the Figure-Eight knot.
     */
    public static KnotGraph createFigureEightKnot() {
        KnotGraph graph = new KnotGraph();
        KnotNode nodeA = new KnotNode("A", 100, 100);
        KnotNode nodeB = new KnotNode("B", 200, 100);
        KnotNode nodeC = new KnotNode("C", 150, 200);
        KnotNode nodeD = new KnotNode("D", 100, 250);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        graph.addEdge(nodeA, nodeB, true, false);   // Over crossing
        graph.addEdge(nodeB, nodeC, false, false);  // Under crossing
        graph.addEdge(nodeC, nodeD, true, false);   // Over crossing
        graph.addEdge(nodeD, nodeA, false, false);  // Under crossing

        return graph;
    }

    /**
     * Creates a Square knot.
     * @return A KnotGraph representing the Square knot.
     */
    public static KnotGraph createSquareKnot() {
        KnotGraph graph = new KnotGraph();
        KnotNode nodeA = new KnotNode("A", 100, 100);
        KnotNode nodeB = new KnotNode("B", 200, 100);
        KnotNode nodeC = new KnotNode("C", 200, 200);
        KnotNode nodeD = new KnotNode("D", 100, 200);
        KnotNode nodeE = new KnotNode("E", 150, 150);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);

        graph.addEdge(nodeA, nodeB, true, false);   // Over crossing
        graph.addEdge(nodeB, nodeC, false, false);  // Under crossing
        graph.addEdge(nodeC, nodeD, true, false);   // Over crossing
        graph.addEdge(nodeD, nodeE, false, false);  // Under crossing
        graph.addEdge(nodeE, nodeA, true, false);   // Over crossing

        return graph;
    }

    /**
     * Creates a Granny knot.
     * @return A KnotGraph representing the Granny knot.
     */
    public static KnotGraph createGrannyKnot() {
        KnotGraph graph = new KnotGraph();
        KnotNode nodeA = new KnotNode("A", 100, 100);
        KnotNode nodeB = new KnotNode("B", 150, 150);
        KnotNode nodeC = new KnotNode("C", 200, 100);
        KnotNode nodeD = new KnotNode("D", 200, 200);
        KnotNode nodeE = new KnotNode("E", 100, 200);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);

        graph.addEdge(nodeA, nodeB, true, false);   // Over crossing
        graph.addEdge(nodeB, nodeC, true, false);   // Over crossing
        graph.addEdge(nodeC, nodeD, false, false);  // Under crossing
        graph.addEdge(nodeD, nodeE, false, false);  // Under crossing
        graph.addEdge(nodeE, nodeA, true, false);   // Over crossing

        return graph;
    }

    /**
     * Creates a Clove Hitch knot.
     * @return A KnotGraph representing the Clove Hitch knot.
     */
    public static KnotGraph createCloveHitchKnot() {
        KnotGraph graph = new KnotGraph();
        KnotNode nodeA = new KnotNode("A", 100, 100);
        KnotNode nodeB = new KnotNode("B", 200, 100);
        KnotNode nodeC = new KnotNode("C", 150, 200);
        KnotNode nodeD = new KnotNode("D", 100, 250);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        graph.addEdge(nodeA, nodeB, false, false);  // Under crossing
        graph.addEdge(nodeB, nodeC, true, false);   // Over crossing
        graph.addEdge(nodeC, nodeD, false, false);  // Under crossing
        graph.addEdge(nodeD, nodeA, true, false);   // Over crossing

        return graph;
    }
}
