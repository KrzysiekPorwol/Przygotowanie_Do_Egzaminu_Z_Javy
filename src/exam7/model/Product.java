package exam7.model;

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

  @Override
  public String toString() {
    return  name + " - " + price + " zł.";
  }
}


//Klasa Product:
//prywatne pola: name (String), price (double),
//konstruktor, gettery,
//toString() np. Milk - 3.20 zł.
//      Klasa Warehouse (magazyn):
//prywatne pole stock typu HashMap<Product, Integer> (klucz = produkt, wartość = ilość na stanie),
//metoda addProduct(Product product, int quantity) — dodaje produkt z podaną ilością do mapy,
//metoda printStock() — wypisuje wszystkie produkty wraz z ilością (jedna linia na produkt),
//metoda getQuantity(Product product) — zwraca ilość danego produktu na stanie.
//W App (main):
//stwórz Warehouse,
//dodaj co najmniej 3 produkty z różnymi ilościami,
//wywołaj printStock(),
//wypisz ilość jednego wybranego produktu przez getQuantity(...).