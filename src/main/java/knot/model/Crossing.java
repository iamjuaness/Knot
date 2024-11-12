package knot.model;

/**
 * Representa un cruce en un nudo matemático.
 * Puede almacenar datos de cualquier tipo.
 * @param <T> Tipo de dato a almacenar en el cruce
 */
public class Crossing<T> {
    private int id;
    private T data;
    private boolean isOver;
    private Crossing<T> next;
    private Crossing<T> under;
    private int x, y;

    public Crossing(int id, T data) {
        this.id = id;
        this.data = data;
        this.isOver = false;
        this.next = null;
        this.under = null;
    }

    // Getters
    public T getData() { return data; }
    public boolean isOver() { return isOver; }
    public Crossing<T> getNext() { return next; }
    public Crossing<T> getUnder() { return under; }
    public int getId() { return id; }
    public int getX() { return x; }
    public int getY() { return y; }

    // Setters
    public void setData(T data) { this.data = data; }
    public void setOver(boolean over) { this.isOver = over; }
    public void setNext(Crossing<T> next) { this.next = next; }
    public void setUnder(Crossing<T> under) { this.under = under; }
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
