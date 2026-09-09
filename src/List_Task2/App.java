package List_Task2;

import java.util.ArrayList;
import java.util.List;

public class App {
  static void main() {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) == 30) {
        numbers.remove(i);
      }
    }

    for (Integer s : numbers) {
      System.out.println(s);
    }

    numbers.remove(0);

    for (Integer s : numbers) {
      System.out.println(s);
    }
  }
}


//Masz listę liczb typu Integer:

//List<Integer> numbers = new ArrayList<>();
// dodaj: 10, 20, 30, 40, 50
//
//      Napisz kod, który:
//
//Usuwa element o WARTOŚCI 30 (nie o indeksie — chcesz się pozbyć konkretnie liczby 30). Potem wypisz całą listę.
//Usuwa element o INDEKSIE 0 (czyli pierwszy w kolejności). Potem wypisz całą listę.
//Popatrz na wynik i odpowiedz mi słowami: co się stało z indeksami pozostałych elementów po usunięciu pierwszego?
// Element, który był pod indeksem 1, ma teraz jaki indeks?