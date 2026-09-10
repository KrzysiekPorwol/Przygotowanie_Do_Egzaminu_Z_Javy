package exam5;

import exam5.model.Book;
import exam5.model.Library;

public class App {

  static void main() {
    Book book1 = new Book("ten obcy", "Czarek");
    Book book4 = new Book("Atomowe nawyki", "Jakis Ogar");
    Book book2 = new Book("w pustyni i puszczy", "Nel");
    Book book3 = new Book("Finansowa Forteca", "Jakis Ogar");


    Library library = new Library();

    library.addBook(book1);
    library.addBook(book4);
    library.addBook(book2);
    library.addBook(book3);

    library.printAllBooks();


    System.out.println("");
    library.findByAuthor("Jakis Ogar");


  }

}


//W App (main):
//stwórz Library,
//dodaj co najmniej 3 książki (przynajmniej dwie tego samego autora),
//wywołaj printAllBooks(),
//wywołaj findByAuthor(...) dla autora, który ma dwie książki.