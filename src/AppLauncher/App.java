package AppLauncher;

public class App {

  static void main() {

    int[] numbers = new int[5];
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Element o indeksie " + i + " ma wartość " + numbers[i]);
      sum = sum + numbers[i];
    }

    System.out.println("Suma wszyskich elementów: " + sum);
  }

}


//Tworzy tablicę int z pięcioma dowolnymi liczbami.
//Przechodzi po niej pętlą i wypisuje każdy element w formacie: Element o indeksie 0 ma wartosc 12.
//Na końcu wypisuje sumę wszystkich elementów.
