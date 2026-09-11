package exam12.Exception;

public class NoSeatsAvailableException extends RuntimeException {
  public NoSeatsAvailableException(String message) {
    super(message);
  }
}
