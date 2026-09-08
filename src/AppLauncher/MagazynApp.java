package AppLauncher;

import model.Magazyn;

public class MagazynApp {

  static void main() {

    Magazyn magazyn = new Magazyn();
    magazyn.dodajProdukt("jabłko", 10);
    magazyn.dodajProdukt("banan", 5);
    magazyn.dodajProdukt("gruszka", 8);

    magazyn.przyjmijDostawe("banan", 7);
    magazyn.wydajProdukt("gruszka");

    magazyn.wyswietlStan();

    System.out.println("Bananów na stanie: " + magazyn.sprawdzStan("banan"));


  }
}
