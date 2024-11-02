package knot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class representing an edge in the knot graph.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KnotEdge {

    public KnotNode from;
    public KnotNode to;
    public boolean isOverCrossing;
    public boolean doubleBond;

    public KnotEdge(KnotNode from, KnotNode to, boolean isOverCrossing) {
        this.from = from;
        this.to = to;
        this.isOverCrossing = isOverCrossing;
    }

}
