package Map_Task2;

import java.util.HashMap;
import java.util.Map;

public class App {

  static void main() {

    String[] words = {"kot", "pies", "kot", "ryba", "pies", "kot"};

    Map<String, Integer> howMuchAnimals = new HashMap<>();

    for (int i = 0; i < words.length; i++) {
      int howMuch = howMuchAnimals.getOrDefault(words[i], 0);

      howMuchAnimals.put(words[i], howMuch + 1);
    }

    for (String s : howMuchAnimals.keySet()) {
      System.out.println(s  + " " + howMuchAnimals.get(s));
    }


  }

}
//  Teraz Zadanie 2 (mapa, rozbudowane) — i to jest serce mapy, wzorzec, na którym potykałeś się najmocniej:
//  mapa jako licznik.
//
//  Masz tablicę słów (mogą się powtarzać):
//
//  String[] slowa = {"kot", "pies", "kot", "ryba", "pies", "kot"};
//
//  Napisz kod, który policzy, ile razy każde słowo wystąpiło, i wypisze wynik, np.:
//
//  kot -> 3
//  pies -> 2
//  ryba -> 1
//
//  Wymagania:
//
//  Użyj HashMap<String, Integer> — klucz to słowo, wartość to licznik.
//  Przejdź przez tablicę jedną pętlą i zliczaj.
//  Na koniec wypisz całą mapę.

