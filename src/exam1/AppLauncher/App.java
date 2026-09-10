package exam1.AppLauncher;

import exam1.model.Book;

public class App {

  static void main() {

    Book bible = new Book("bilbia", "Jezus", 500);
    Book kleks = new Book("Pan Kleks", "Kleksik", 300);

    bible.printInfo();

    kleks.printInfo();

  }

}


//Napisz klasę Book, która ma:
//
//trzy prywatne pola: title (String), author (String), pages (int),
//konstruktor przyjmujący wszystkie trzy wartości,
//gettery do wszystkich trzech pól,
//metodę printInfo(), która wypisuje na konsolę opis książki w formacie:
//      "Title" by Author (123 pages)