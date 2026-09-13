package exam20.Exception;

public class InThisLibraryBookDontExistException extends RuntimeException {
  public InThisLibraryBookDontExistException(String message) {
    super(message);
  }
}
