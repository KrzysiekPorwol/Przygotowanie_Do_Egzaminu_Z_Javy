package Map_Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

  static void main() {
    Map<String, Integer> products = new HashMap<>();
    Scanner input = new Scanner(System.in);

    products.put("chleb", 5);
    products.put("masło", 4);
    products.put("bułka", 1);

    System.out.println("Wpisz nazwe produktu ktorego chcesz poznac cene: ");
    String nameProduct = input.nextLine();

    if (products.containsKey(nameProduct)) {
      System.out.println("Cena produktu " + nameProduct + " to: " + products.get(nameProduct));
    } else {
      System.out.println("Nie ma takiego produtku!");
    }

    for (String k : products.keySet()) {
      System.out.println(k + " " + products.get(k));
    }

    System.out.println(products.get("nie ma takiego produktu"));
  }
//
//  public static void writePrice(String key) {
//    System.out.println("Cena produktu " + key + " to: " + );
//  }

}


//Tworzy HashMap, gdzie kluczem jest nazwa produktu (String), a wartością jego cena (Integer).

//Dodaje 3 produkty z cenami, np. "chleb" → 5, "mleko" → 3, "masło" → 8.

//Wypisuje cenę jednego konkretnego produktu po jego nazwie (np. „Cena masła to: 8").

//Wypisuje wszystkie pary klucz→wartość (pętlą — zastanów się, jak przejść po mapie, skoro nie ma indeksów).

//Na koniec: spróbuj pobrać cenę produktu, którego nie ma w mapie (np. "ser"), i wypisz, co zwróci get().