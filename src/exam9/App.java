package exam9;

import exam9.model.TrafficLight;

public class App {

  static void main() {

    for (TrafficLight t : TrafficLight.values()) {
     System.out.println(t + ": " + t.getAction());
    }
  }

}



//Napisz enum TrafficLight oraz klasę Main.
//
//Enum TrafficLight ma trzy wartości: RED, YELLOW, GREEN.
//W enumie dodaj metodę String getAction(), która używając switch po wartości światła zwraca tekst:
//dla RED → "Stop"
//dla YELLOW → "Get ready"
//dla GREEN → "Go"
//W klasie Main, w metodzie main, przejdź pętlą po wszystkich wartościach enuma TrafficLight i dla każdej wypisz na konsolę w formacie:
//RED: Stop
//YELLOW: Get ready
//GREEN: Go