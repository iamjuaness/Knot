package knot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Representa un cruce en un nudo matemático.
 * Puede almacenar datos de cualquier tipo.
 * @param <T> Tipo de dato a almacenar en el cruce
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Crossing<T> {
    @EqualsAndHashCode.Include
    private int id;
    private T data;
    private boolean isOver;
    private Crossing<T> next;
    private Crossing<T> under;
    private boolean isSingle;
    private int x;
    private int y;

    public Crossing(int id, T data) {
        this.id = id;
        this.data = data;
        this.isOver = false;
        this.next = null;
        this.under = null;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
