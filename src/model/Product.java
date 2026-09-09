package model;

import java.util.Objects;

public class Product {
  private String name;
  private ProductCategory category;
  private double price;

  public Product(String name, ProductCategory category, double price) {
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductCategory getCategory() {
    return category;
  }

  public void setCategory(ProductCategory category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && category == product.category;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, price);
  }

  @Override
  public String toString() {
    return  name + " (" + category + ") - " + price + " zł";
  }
//  nazwa (kategoria) – cena zł
}
