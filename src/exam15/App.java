package exam15;

import exam15.model.Book;

import java.util.HashSet;
import java.util.Set;

public class App {

  static void main() {

    Set<Book> books = new HashSet<>();

    books.add(new Book("Bible1", "Autor1"));
    books.add(new Book("Bible2", "Autor2"));
    books.add(new Book("Bible3", "Autor3"));
    books.add(new Book("Bible2", "Autor2"));

    System.out.println(books);

  }

}


//Napisz program, który zapamiętuje kolekcję książek i nie dopuszcza duplikatów.
//
//Wymagania:
//
//Klasa Book z dwoma polami: title (String) i author (String), konstruktor ustawiający oba pola.
//Dwie książki mają być traktowane jako ta sama książka, jeśli mają identyczny tytuł i autora.
// Zadbaj, żeby Book poprawnie się zachowywał w HashSet.

//W main: stwórz HashSet<Book>, dodaj do niego cztery książki, z czego dwie mają być identyczne
// (ten sam tytuł i autor). Na końcu wypisz na konsolę rozmiar zbioru.
//Oczekiwany wynik na konsoli: 3 (bo jeden z czterech to duplikat, który nie powinien się dodać).