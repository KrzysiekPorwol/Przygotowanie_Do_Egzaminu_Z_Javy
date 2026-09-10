package exam5.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void printAllBooks() {
    for (Book b : books) {
      System.out.println(b.toString());
    }
  }

  public void findByAuthor(String author) {
    for (Book b : books) {
      if (author.equals(b.getAuthor())) {
        System.out.println(b.toString());
      }
    }
  }
}


//Klasa Library:
//prywatne pole books typu ArrayList<Book> (zainicjalizowane pustą listą),
//metoda addBook(Book book) — dodaje książkę do listy,
//metoda printAllBooks() — wypisuje wszystkie książki (jedna na linię),
//metoda findByAuthor(String author) — przechodzi po liście i wypisuje tylko książki danego autora.