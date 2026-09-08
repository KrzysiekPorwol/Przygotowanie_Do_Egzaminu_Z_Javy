package logic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
  static void main() {

    List<String> shoppingList = new ArrayList<>();

    shoppingList.add("mleko");
    shoppingList.add("mleko1");
    shoppingList.add("mleko2");
    shoppingList.add("mleko3");

    shoppingList.remove(1);

    for (String product : shoppingList) {
      System.out.println(product);
    }
    System.out.println(shoppingList.size());

  }



}



//Zadanie 1 — proste (ArrayList + foreach)
//
//Napisz w nowej klasie (np. Listy w pakiecie logic) program, który:
//
//tworzy ArrayList przechowujący String — Twoją listę zakupów,
//dodaje do niej 4 produkty (dowolne),
//usuwa jeden z nich (dowolny),
//wypisuje na konsolę wszystkie pozostałe produkty, każdy w osobnej linii, używając pętli foreach,
//na końcu wypisuje, ile produktów zostało na liście.