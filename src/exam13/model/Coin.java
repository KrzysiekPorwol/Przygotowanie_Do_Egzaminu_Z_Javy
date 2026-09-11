package exam13.model;

public enum Coin {
  ONE_GROSZ(1), TWENTY_GROSZY(20), ONE_ZLOTY(100), FIVE_ZLOTY(500);

  private int grosze;

  Coin(int grosze) {
    this.grosze = grosze;
  }

  public int getGrosze() {
    return grosze;
  }
}


//Wracamy do Twojego mocnego obszaru — enumów — ale robimy krok dalej: enum z polem i konstruktorem.
// Piszesz sam, wklejasz kod. Dokładna treść:
//
//Napisz enum Coin oraz klasę z main.
//
//Enum Coin reprezentuje monety, każda ma przypisaną wartość w groszach. Cztery wartości:
//ONE_GROSZ = 1
//TWENTY_GROSZY = 20
//ONE_ZLOTY = 100
//FIVE_ZLOTY = 500
//Żeby to osiągnąć, enum ma mieć:
//prywatne pole int grosze,
//konstruktor przyjmujący tę wartość i zapisujący ją do pola,
//getter getGrosze().
//      (Wartości w nawiasach, np. ONE_ZLOTY(100), przekazujesz do konstruktora — to jest właśnie ta nowa rzecz.)
//W klasie z main przejdź pętlą po wszystkich wartościach Coin.values() i dla każdej wypisz nazwę oraz wartość w groszach, w formacie:
//ONE_GROSZ = 1 gr
//      TWENTY_GROSZY = 20 gr
//      ONE_ZLOTY = 100 gr
//      FIVE_ZLOTY = 500 gr