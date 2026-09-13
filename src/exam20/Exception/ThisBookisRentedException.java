package exam20.Exception;

public class ThisBookisRentedException extends RuntimeException {
  public ThisBookisRentedException(String message) {
    super(message);
  }
}
