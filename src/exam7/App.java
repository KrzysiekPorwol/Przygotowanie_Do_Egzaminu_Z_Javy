package exam7;

import exam7.model.Product;
import exam7.model.Warehouse;

public class App {

  static void main() {
    Warehouse warehouse = new Warehouse();

    Product klej = new Product("klej", 2.99);

    warehouse.addProduct(klej, 5);
    warehouse.addProduct(new Product("silikon", 3.99), 3);
    warehouse.addProduct(new Product("trytyka", 1.99), 1);

    warehouse.printStock();

    System.out.println("");

    System.out.println(warehouse.getAmount(klej));
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