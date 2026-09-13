package exam20;

import exam20.Exception.InThisLibraryBookDontExistException;
import exam20.Exception.ThisBookisRentedException;
import exam20.model.Book;
import exam20.model.Library;

public class App {

  static void main() {

    Library library = new Library();

    Book book1 = new Book("Adamice", "1670", 2026);
    Book book2 = new Book("Adamicee", "1680", 2025);
    Book book3 = new Book("Adamiceee", "1690", 2024);
    Book book4 = new Book("Adamiceeee", "1700", 2023);


    library.addBook(book1);
    library.addBook(book2);

    library.printAllBooks();

    try {
      library.rentedBook("Adamice");
    } catch (InThisLibraryBookDontExistException | ThisBookisRentedException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");

    library.printAllBooks();

    try {
      library.rentedBook("Adamice");
    } catch (InThisLibraryBookDontExistException | ThisBookisRentedException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");

    library.printAllBooks();

    try {
      library.rentedBook("Adamiceeeeee");
    } catch (InThisLibraryBookDontExistException | ThisBookisRentedException e) {
      System.out.println(e.getMessage());
    }

    try {
      library.getBackBook("Adamczycha");
    } catch (InThisLibraryBookDontExistException e) {
      System.out.println(e.getMessage());
    }

    try {
      library.getBackBook("Adamice");
    } catch (InThisLibraryBookDontExistException e) {
      System.out.println(e.getMessage());
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