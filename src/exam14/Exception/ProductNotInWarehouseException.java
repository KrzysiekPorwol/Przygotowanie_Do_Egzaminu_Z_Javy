package exam14.Exception;

public class ProductNotInWarehouseException extends RuntimeException {
  public ProductNotInWarehouseException(String message) {
    super(message);
  }
}
