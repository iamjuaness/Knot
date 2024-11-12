package knot.utils;

import knot.model.Crossing;
import knot.model.DataKnot;

import java.util.*;

/**
 * Utilidades para trabajar con nudos
 */
public class KnotUtils {

    public static <T> boolean isClosed(DataKnot<T> knot) {
        Set<Crossing<T>> visited = new HashSet<>();
        Crossing<T> current = knot.getCrossing(1);

        while (current != null && !visited.contains(current)) {
            visited.add(current);
            current = current.getNext();
        }

        return current != null && visited.contains(current);
    }

    public static <T> int countCrossings(DataKnot<T> knot) {
        Set<Crossing<T>> visited = new HashSet<>();
        Crossing<T> current = knot.getCrossing(1);

        while (current != null && !visited.contains(current)) {
            visited.add(current);
            current = current.getNext();
        }

        return visited.size();
    }

    public static <T> List<T> getDataInOrder(DataKnot<T> knot) {
        List<T> orderedData = new ArrayList<>();
        Set<Crossing<T>> visited = new HashSet<>();
        Crossing<T> current = knot.getCrossing(1);

        while (current != null && !visited.contains(current)) {
            visited.add(current);
            orderedData.add(current.getData());
            current = current.getNext();
        }

        return orderedData;
    }
}
