package servicio;

public class NumeroNoDisponibleException extends Exception {

    public NumeroNoDisponibleException(String message) {
        super(message);
    }

    public NumeroNoDisponibleException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
