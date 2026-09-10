package exam1.model;

public class Book {
  private String title;
  private String author;
  private int pages;

  public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public void printInfo() {
    System.out.println("\"" + title + "\" by " + author + " (" + pages + " pages)");
  }
}


//Napisz klasę Book, która ma:
//
//trzy prywatne pola: title (String), author (String), pages (int),
//konstruktor przyjmujący wszystkie trzy wartości,
//gettery do wszystkich trzech pól,
//metodę printInfo(), która wypisuje na konsolę opis książki w formacie:
//      "Title" by Author (123 pages)