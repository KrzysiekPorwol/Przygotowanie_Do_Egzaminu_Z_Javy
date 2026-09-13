package exam15.model;

import java.util.Objects;

public class Book {

  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(title, book.title) && Objects.equals(author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author);
  }

  @Override
  public String toString() {
    return "Book{" +
          "title='" + title + '\'' +
          ", author='" + author + '\'' +
          '}';
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