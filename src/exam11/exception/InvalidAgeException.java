package exam11.exception;

public class InvalidAgeException extends RuntimeException {

 public InvalidAgeException(String message) {
    super(message);
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