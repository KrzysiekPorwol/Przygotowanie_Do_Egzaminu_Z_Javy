package exam14.Exception;

public class ProductOutOfStockException extends RuntimeException {
  public ProductOutOfStockException(String message) {
    super(message);
  }
}
