package Array_task2;

public class app {

  static void main() {
    int[] grades = {3, 5, 2, 5, 4, 1, 5};

    int smallGrades = grades[0];
    int bigGrades = grades[0];
    int howMuchHave5 = 0;

    for (int i = 0; i < grades.length; i++) {
      if (smallGrades > grades[i]) {
        smallGrades = grades[i];
      }
      if (bigGrades < grades[i]) {
        bigGrades = grades[i];
      }
      if (grades[i] == 5) {
        howMuchHave5 = howMuchHave5 + 1;
      }
    }
    System.out.println("Najmniejsza ocena : " + smallGrades);
    System.out.println("Najwieksza ocena : " + bigGrades);
    System.out.println("Ilość ocen 5: " + howMuchHave5);


  }

}

//Skoro tablicę proszą masz — Zadanie 2 (tablica, rozbudowane):
//
//Masz tablicę z ocenami (liczby całkowite), np. {3, 5, 2, 5, 4, 1, 5}.
//      Napisz kod, który jednym przejściem przez tablicę znajdzie i wypisze:
//
//największą ocenę,
//najmniejszą ocenę,
//ile razy wystąpiła ocena 5.
//
//Warunki:
//
//Nie używaj gotowców typu Arrays.sort ani Collections.max — chodzi o to, żebyś sam ogarnął logikę „lecę po
//tablicy i pamiętam najlepszy dotychczasowy wynik".
//
//Ma być jedna pętla (skoro przy zadaniu 1 gadaliśmy o niepotrzebnym chodzeniu dwa razy).
//
//Podpowiem tylko tyle: zastanów się, od jakiej wartości startową zmienną „największa" " +
//      "i „najmniejsza" ustawić przed pętlą — to jest tu cały myk. Pisz sam, wrzuć jak skończysz.