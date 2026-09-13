package exam17.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {

  private Map<Integer, User> userRepository = new HashMap<>();

  public void addUser(User user) {
    userRepository.put(user.getId(), user);
  }

  public Optional<User> findById(int id) {
    return Optional.ofNullable(userRepository.get(id));
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