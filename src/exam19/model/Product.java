package exam19.model;

public class Product {
  private String code;
  private String name;

  public Product(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Product{" +
          "code='" + code + '\'' +
          ", name='" + name + '\'' +
          '}';
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