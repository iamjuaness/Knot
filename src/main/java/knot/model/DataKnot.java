package knot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Clase principal que representa un nudo matemático con capacidad
 * de almacenar datos en sus cruces.
 * @param <T> Tipo de dato a almacenar en los cruces del nudo
 */
@Getter
@Setter
public class DataKnot<T> {
    private Crossing<T> start;
    private int crossingCount;
    private Map<Integer, Crossing<T>> crossingsMap;

    public DataKnot() {
        this.start = null;
        this.crossingCount = 0;
        this.crossingsMap = new HashMap<>();
    }

    public Crossing<T> addCrossing(T data) {
        Crossing<T> newCrossing = new Crossing<>(++crossingCount, data);
        crossingsMap.put(crossingCount, newCrossing);
        if (start == null) {
            start = newCrossing;
        }
        return newCrossing;
    }

    public void connect(Crossing<T> from, Crossing<T> to, boolean isOver) {
        from.setNext(to);
        if (isOver) {
            from.setOver(true);
            to.setUnder(from);
        }
    }

    public Crossing<T> getCrossing(int id) {
        return crossingsMap.get(id);
    }

    public void updateData(int crossingId, T newData) {
        Crossing<T> crossing = crossingsMap.get(crossingId);
        if (crossing != null) {
            crossing.setData(newData);
        }
    }

    public List<T> processAllData() {
        List<T> allData = new ArrayList<>();
        if (start == null) return allData;

        Crossing<T> current = start;
        do {
            allData.add(current.getData());
            current = current.getNext();
        } while (current != start && current != null);

        return allData;
    }

    public void applyToAllData(Function<T, T> operation) {
        if (start == null) return;

        Crossing<T> current = start;
        do {
            T newData = operation.apply(current.getData());
            current.setData(newData);
            current = current.getNext();
        } while (current != start && current != null);
    }

    public List<Crossing<T>> findCrossings(Predicate<T> condition) {
        List<Crossing<T>> found = new ArrayList<>();
        if (start == null) return found;

        Crossing<T> current = start;
        do {
            if (condition.test(current.getData())) {
                found.add(current);
            }
            current = current.getNext();
        } while (current != start && current != null);

        return found;
    }
}
