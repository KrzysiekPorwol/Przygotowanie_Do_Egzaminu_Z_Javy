package exam16.model;

import exam16.Exception.ThisVideoDontExistException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VideoCatalog {

  private Map<String, Video> videoCatalog = new HashMap<>();

  public void addVideo(Video video) {
    videoCatalog.put(video.getName(), video);
  }

  public void printCatalog() {
    System.out.println(videoCatalog);
  }

  public void findVideoByTitle(String name) {

    if (!name.equals(videoCatalog.getOrDefault(name, videoCatalog.get(name)).getName())) {
      throw new ThisVideoDontExistException("Takiego tytuły nie ma w katalogu");
    }
    System.out.println(videoCatalog.get(name));
  }
}

//Napisz aplikację symulującą prosty katalog filmów. Ma się dać:
//
//dodać film (tytuł, reżyser, rok produkcji),
//wyświetlić wszystkie filmy,
//wyszukać film po tytule — a jeśli takiego filmu nie ma, program ma sobie z tym sensownie poradzić.

//rzeczownik: film (tytul, rezyser, rok produkcji)
//czasownik: wyswietlac wszystkie filmy, wyszukac film po tytule