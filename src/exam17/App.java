package exam17;

import exam17.model.User;
import exam17.model.UserRepository;

import java.util.Optional;

public class App {

  static void main() {

    UserRepository userRepository = new UserRepository();

    userRepository.addUser(new User(5, "Krzysiek"));
    userRepository.addUser(new User(2, "Dawid"));

    int x = 5;

    userRepository.findById(x).ifPresentOrElse(
          name -> System.out.println(name.toString()),
          () -> System.out.println("Nie ma uzytkownika o numerze id" + x)
    );

    int y = 1;

    userRepository.findById(y).ifPresentOrElse(
          name -> System.out.println(name.toString()),
          () -> System.out.println("Nie ma uzytkownika o numerze id " + y)
    );

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