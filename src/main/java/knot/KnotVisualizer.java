package knot;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class KnotVisualizer extends JPanel {
    private KnotGraph knotGraph;

    public KnotVisualizer(KnotGraph knotGraph) {
        this.knotGraph = knotGraph;
        setPreferredSize(new Dimension(800, 600)); // Tamaño de la ventana
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawKnot(g);
    }

    private void drawKnot(Graphics g) {
        List<KnotNode> nodes = knotGraph.getNodes();
        List<KnotEdge> edges = knotGraph.getEdges();

        // Dibujar los nodos
        for (KnotNode node : nodes) {
            int x = node.getX(); // Obtener coordenadas
            int y = node.getY();
            g.fillOval(x - 5, y - 5, 10, 10); // Dibuja un círculo para el nodo
            g.drawString(node.getLabel(), x + 10, y); // Etiqueta del nodo
        }

        // Dibujar las aristas
        for (KnotEdge edge : edges) {
            KnotNode from = edge.getFrom();
            KnotNode to = edge.getTo();
            int x1 = from.getX(); // Obtener coordenadas del nodo de origen
            int y1 = from.getY();
            int x2 = to.getX(); // Obtener coordenadas del nodo de destino
            int y2 = to.getY();

            // Configurar color y grosor según el tipo de enlace
            if (edge.isOverCrossing()) {
                g.setColor(Color.RED); // Color para enlaces con cruce superior
            } else {
                g.setColor(Color.BLUE); // Color para enlaces con cruce inferior
            }

            // Cambiar el grosor para enlaces dobles
            if (edge.isDoubleBond()) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(3)); // Grosor mayor para enlaces dobles
            } else {
                ((Graphics2D) g).setStroke(new BasicStroke(1)); // Grosor normal para enlaces simples
            }

            // Dibuja la línea entre los nodos
            g.drawLine(x1, y1, x2, y2);
        }
    }

    // Método para iniciar la visualización
    public static void visualizeKnot(KnotGraph knotGraph) {
        JFrame frame = new JFrame("Knot Visualizer");
        KnotVisualizer visualizer = new KnotVisualizer(knotGraph);
        frame.add(visualizer);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

