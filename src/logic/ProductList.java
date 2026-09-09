package logic;

import model.Product;
import model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

  private List<Product> listProducts;

  public ProductList() {
    this.listProducts = new ArrayList<>();
  }

  public void addProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException("Produkt nie może być null");
    } else {
      listProducts.add(product);
    }
  }

  public Product getProduct(int productnumber) {
    return listProducts.get(productnumber);
  }

  public void removeProduct(Product product) {
    listProducts.remove(product);
  }

  public void showCategoryProduct( ProductCategory productCategory) {
    for (Product p : listProducts) {
      if (productCategory.equals(p.getCategory())) {
        System.out.println(p);
      }
    }
  }

  public void showProduct() {
    for (Product p : listProducts) {
      System.out.println(p.toString());
    }
  }
}
