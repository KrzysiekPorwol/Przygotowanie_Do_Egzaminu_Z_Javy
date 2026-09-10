package exam4.model;

public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}


//Napisz klasę Product:
//
//prywatne pola: name (String), price (double),
//konstruktor przyjmujący oba,
//gettery getName() i getPrice().