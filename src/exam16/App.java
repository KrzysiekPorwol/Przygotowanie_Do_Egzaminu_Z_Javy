package exam16;

import exam16.Exception.ThisVideoDontExistException;
import exam16.model.Video;
import exam16.model.VideoCatalog;

public class App {

  static void main() {
    VideoCatalog videoCatalog = new VideoCatalog();

    videoCatalog.addVideo(new Video("Film1", "autor1", 2009));
    videoCatalog.addVideo(new Video("Film2", "autor1", 2009));
    videoCatalog.addVideo(new Video("Film3", "autor1", 2009));

    videoCatalog.printCatalog();

    System.out.println("");

    try {
      videoCatalog.findVideoByTitle("Film2");
    } catch (ThisVideoDontExistException e) {
      System.out.println(e.getMessage());
    }

    try {
      videoCatalog.findVideoByTitle("Film4");
    } catch (ThisVideoDontExistException e) {
      System.out.println(e.getMessage());
    }
  }

}


//Napisz aplikację symulującą prosty katalog filmów. Ma się dać:
//
//dodać film (tytuł, reżyser, rok produkcji),
//wyświetlić wszystkie filmy,
//wyszukać film po tytule — a jeśli takiego filmu nie ma, program ma sobie z tym sensownie poradzić.

//rzeczownik: film (tytul, rezyser, rok produkcji)
//czasownik: wyswietlac wszystkie filmy, wyszukac film po tytule