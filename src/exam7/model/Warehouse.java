package exam7.model;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

  private Map<Product, Integer> stock = new HashMap<>();

  public void addProduct(Product product, Integer amount) {
    stock.put(product, amount);
  }

  public void printStock() {
    for (Product p : stock.keySet()) {
      System.out.println(p.toString());
    }
  }

  public int getAmount (Product product) {
   return stock.get(product);

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