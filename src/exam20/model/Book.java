package exam20.model;

public class Book {

  private String title;
  private String author;
  private int year;
  private boolean rented = false;

  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYear() {
    return year;
  }

  public boolean isRented() {
    return rented;
  }

  public void setRented(boolean rented) {
    this.rented = rented;
  }

  @Override
  public String toString() {
    return "Book{" +
          "title='" + title + '\'' +
          ", author='" + author + '\'' +
          ", year=" + year +
          '}';
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