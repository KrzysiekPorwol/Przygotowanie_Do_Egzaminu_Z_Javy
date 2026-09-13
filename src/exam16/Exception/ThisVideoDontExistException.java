package exam16.Exception;

public class ThisVideoDontExistException extends RuntimeException {
  public ThisVideoDontExistException(String message) {
    super(message);
  }
}
