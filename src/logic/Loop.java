package logic;

public class Loop {


  static void main() {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        continue;
      } else {
        System.out.print(i);
      }
    }
  }

}


//Przechodzi po liczbach od 1 do 10 i wypisuje tylko liczby parzyste (2, 4, 6, 8, 10) —
//z jednym warunkiem: użyj continue, żeby pominąć liczby nieparzyste.