package List_Task1;

import java.util.ArrayList;
import java.util.List;

public class App {
  static void main() {

    List<String> listProducts = new ArrayList<>();

    listProducts.add("chleb");
    listProducts.add("masło");
    listProducts.add("bułka");
    listProducts.add("twaróg");

    System.out.println(listProducts.size());

    for (String s : listProducts) {
      System.out.println(s);
    }

    listProducts.add("ser");


    System.out.println(listProducts.size());



  }
}

//Zrób listę zakupów. Napisz kod, który:
//
//Tworzy ArrayList na String-i.
//      Dodaje do niej 4 produkty (np. "chleb", "mleko", "masło", "jajka").
//Wypisuje ile produktów jest na liście.
//Wypisuje wszystkie produkty (pętlą).
//Na koniec dodaje jeszcze jeden produkt (np. "ser") i ponownie wypisuje .size() —
// żeby było widać, że rozmiar urósł sam z siebie.