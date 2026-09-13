package exam19;

import exam19.model.Product;
import exam19.model.ProductRepository;

public class App {

  static void main() {
    ProductRepository productRepository = new ProductRepository();

    Product product1 = new Product("1234", "Ser");
    Product product2 = new Product("12345", "masło");
    Product product3 = new Product("12346", "chlyb");

    productRepository.addProduct(product1);
    productRepository.addProduct(product2);


    productRepository.findByCode(product1.getCode()).ifPresentOrElse(
          product -> System.out.println(product.toString()),
          () -> System.out.println("Nie znaleziono produktu o codzie " + product1.getCode()));

    productRepository.findByCode(product3.getCode()).ifPresentOrElse(
          product -> System.out.println(product.toString()),
          () -> System.out.println("Nie znaleziono produktu o codzie " + product3.getCode()));
  }
}


//Klasa Product: pola code (String) i name (String), konstruktor ustawiający oba, gettery, toString.
//Klasa ProductRepository: pole Map<String, Product> (kluczem niech będzie code). Dwie metody:
//addProduct(Product product) — wkłada produkt do mapy pod kluczem code,
//Optional<Product> findByCode(String code) — typ zwracany to Optional<Product>, a w środku jedna linia:
// return Optional.ofNullable(map.get(code));. ofNullable sam zamienia null na pusty Optional,
// a istniejący produkt na Optional z wartością.
//W main:
//stwórz repozytorium, dodaj dwa produkty (np. kody "A1" i "B2"),
//wyszukaj jeden kod, który istnieje, i jeden, którego nie ma,
//dla każdego wyniku użyj .ifPresentOrElse(...) — pierwszy argument to co zrobić, gdy produkt JEST (wypisz go),
// drugi to co zrobić, gdy jest PUSTO (wypisz "Nie znaleziono produktu o kodzie X").