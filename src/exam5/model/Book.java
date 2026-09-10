package exam5.model;

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

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "\"" + title + "\" by " + author + ".";
  }
}


//Klasa Book:
//prywatne pola: title (String), author (String),
//konstruktor, gettery,
//toString() zwracający np. "The Hobbit" by J.R.R. Tolkien.