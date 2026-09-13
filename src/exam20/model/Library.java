package exam20.model;

import exam20.Exception.InThisLibraryBookDontExistException;
import exam20.Exception.ThisBookisRentedException;

import java.util.HashMap;
import java.util.Map;

public class Library {

  private Map<String, Book> books = new HashMap<>();

  public void addBook(Book book) {
    books.put(book.getTitle(), book);
  }

  public void rentedBook(String title) {

    if (books.get(title) == null) {
      throw new InThisLibraryBookDontExistException("Nie ma takiej książki do wypożyczania w bibliotece");
    } else if (books.get(title).isRented()) {
      throw new ThisBookisRentedException("Ta książka jest już wypożyczona");
    } else {
      books.get(title).setRented(true);
    }
  }

  public void getBackBook(String title) {
    if (books.get(title) == null) {
      throw new InThisLibraryBookDontExistException("Ta ksiązka nie pochodzi z tej biblioteki. Nie ma takiej ksiązki w bazie");
    } else {
      books.get(title).setRented(false);
    }
  }

  public void printAllBooks() {
    for (Book b : books.values()) {
      if (!b.isRented()) {
        System.out.println(b);
      }
    }
  }


}

//Napisz prosty system wypożyczalni książek. Ma się dać:
//
//dodać książkę do wypożyczalni,
//wypożyczyć książkę po tytule,
//zwrócić książkę po tytule,
//wyświetlić książki dostępne do wypożyczenia.
//
//Zadbaj o sytuacje wyjątkowe — system ma sobie z nimi sensownie poradzić:
//
//ktoś chce wypożyczyć książkę, której w wypożyczalni w ogóle nie ma,
//ktoś chce wypożyczyć książkę, która jest już wypożyczona.
