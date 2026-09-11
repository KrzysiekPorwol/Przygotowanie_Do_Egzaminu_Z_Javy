package exam11;

import exam11.exception.InvalidAgeException;
import exam11.model.Person;

public class App {

  static void main() {

    Person person1 = new Person(30);

    System.out.println(person1);

    try {
      Person person2 = new Person(-5);
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

  }

}


//Napisz trzy rzeczy: własny wyjątek InvalidAgeException, klasę Person i klasę z main.
//
//Własny wyjątek InvalidAgeException — ma dziedziczyć po RuntimeException i mieć konstruktor przyjmujący
// String message, który przekazuje ten komunikat do klasy bazowej.
//Klasa Person:
//prywatne pole int age,
//konstruktor Person(int age), który: jeśli age jest mniejszy niż 0 lub większy niż 150 — rzuca
// InvalidAgeException z sensownym komunikatem (napisz w nim, jaka wartość była błędna).
// W przeciwnym razie normalnie ustawia pole,

//getter getAge().
//Klasa z main, w której:
//tworzysz Person z wiekiem 30 i wypisujesz jego wiek na konsolę,
//a potem w bloku try/catch próbujesz stworzyć Person z wiekiem -5, łapiesz InvalidAgeException i
// wypisujesz jego komunikat (e.getMessage()).
//
//Na konsoli ma się pojawić najpierw 30, a potem Twój komunikat błędu. Resztę projektujesz sam. Czekam na kod.