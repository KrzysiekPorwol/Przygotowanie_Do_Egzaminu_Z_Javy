package exam16.model;

import java.util.Objects;

public class Video {
  private String name;
  private String director;
  private int yearProduction;

  public Video(String name, String director, int yearProduction) {
    this.name = name;
    this.director = director;
    this.yearProduction = yearProduction;
  }

  public String getName() {
    return name;
  }

  public String getDirector() {
    return director;
  }

  public int getYearProduction() {
    return yearProduction;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Video video = (Video) o;
    return yearProduction == video.yearProduction && Objects.equals(name, video.name) && Objects.equals(director, video.director);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, director, yearProduction);
  }

  @Override
  public String toString() {
    return "Video{" +
          "name='" + name + '\'' +
          ", director='" + director + '\'' +
          ", yearProduction=" + yearProduction +
          '}';
  }
}


//Napisz aplikację symulującą prosty katalog filmów. Ma się dać:
//
//dodać film (tytuł, reżyser, rok produkcji),
//wyświetlić wszystkie filmy,
//wyszukać film po tytule — a jeśli takiego filmu nie ma, program ma sobie z tym sensownie poradzić.

//rzeczownik: film (tytul, rezyser, rok produkcji)
//czasownik: wyswietlac wszystkie filmy, wyszukac film po tytule