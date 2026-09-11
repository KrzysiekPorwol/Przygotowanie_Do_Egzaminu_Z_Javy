package exam9.model;

public enum TrafficLight {
  RED, YELLOW, GREEN;

  public String getAction() {
    return switch (this) {
      case RED -> "Stop";
      case YELLOW -> "Get ready";
      case GREEN -> "Go";
  };


}}

//Napisz enum TrafficLight oraz klasę Main.
//
//Enum TrafficLight ma trzy wartości: RED, YELLOW, GREEN.
//W enumie dodaj metodę String getAction(), która używając switch po wartości światła zwraca tekst:
//dla RED → "Stop"
//dla YELLOW → "Get ready"
//dla GREEN → "Go"
//W klasie Main, w metodzie main, przejdź pętlą po wszystkich wartościach enuma TrafficLight i dla każdej
// wypisz na konsolę w formacie:
//RED: Stop
//YELLOW: Get ready
//GREEN: Go
