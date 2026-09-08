package model;

import java.util.HashMap;
import java.util.Map;

public class Magazyn {

  private Map<String, Integer> produkty;   // ukryty "silnik" — mapa nazwa -> ilość

  public Magazyn() {
    this.produkty = new HashMap<>();
    // TODO: zainicjalizuj produkty jako new HashMap<>()
  }

  // wstawia produkt z podaną ilością (albo ustawia od nowa)
  public void dodajProdukt(String nazwa, int ilosc) {
    produkty.put(nazwa, ilosc);
    // TODO: put
  }

  // DOSTAWA: zwiększa istniejący stan o `ilosc` (ten trudny punkt z poprzedniej wersji)
  public void przyjmijDostawe(String nazwa, int ilosc) {
    int aktualnaIlosc = sprawdzStan(nazwa);
    produkty.put(nazwa, ilosc + aktualnaIlosc);
    // TODO: odczytaj obecny stan, dodaj ilosc, zapisz z powrotem
  }

  // usuwa produkt całkiem z magazynu
  public void wydajProdukt(String nazwa) {
    produkty.remove(nazwa);
    // TODO: remove
  }

  // zwraca ile sztuk danego produktu jest na stanie
  public int sprawdzStan(String nazwa) {
    return produkty.get(nazwa);
    // TODO: return get(...)
  }

  // wypisuje cały stan przez foreach, w formacie "banan: 12 szt."
  public void wyswietlStan() {
    for (String product : produkty.keySet()) {
      System.out.println(product + sprawdzStan(product));
    }
    // TODO: foreach po keySet()
  }
}
