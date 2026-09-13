package exam17.model;

public class User {
  private final int id;
  private final String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "User{" +
          "id=" + id +
          ", name='" + name + '\'' +
          '}';
  }
}


//Klasa User z polami id (int) i name (String), konstruktor, gettery, toString.
//Klasa UserRepository z polem Map<Integer, User>. Metody:
//addUser(User user) — dodaje użytkownika (kluczem w mapie niech będzie id),
//Optional<User> findById(int id) — zwraca Optional, a nie User i nie null. W środku użyj Optional.ofNullable(...).
//W main:
//      stwórz repozytorium, dodaj dwóch użytkowników (np. id 1 i 2),
//      wyszukaj użytkownika, który istnieje, i takiego, który nie istnieje,
//dla każdego wyniku: jeśli użytkownik jest — wypisz jego dane; jeśli go nie ma — wypisz "Nie znaleziono
// użytkownika o id X". Do obsłużenia obu przypadków użyj Optional (np. ifPresentOrElse).
//Oczekiwany efekt na konsoli: dla istniejącego id wypisują się dane użytkownika, dla nieistniejącego —
// komunikat o nieznalezieniu.
//
//Kluczowa zasada: findById ma tylko zwrócić Optional. Decyzję „co zrobić, gdy jest / gdy nie ma" podejmuje main,
// nie repozytorium. Pisz sam, wklej jak gotowe.