package knot.exception;

/**
 * Excepción personalizada para operaciones con nudos
 */
public class KnotException extends RuntimeException {
    public KnotException(String message) {
        super(message);
    }

    public KnotException(String message, Throwable cause) {
        super(message, cause);
    }
}
