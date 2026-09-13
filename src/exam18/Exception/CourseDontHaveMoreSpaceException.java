package exam18.Exception;

public class CourseDontHaveMoreSpaceException extends RuntimeException {
  public CourseDontHaveMoreSpaceException(String message) {
    super(message);
  }
}
