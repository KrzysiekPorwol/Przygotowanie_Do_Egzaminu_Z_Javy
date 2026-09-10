package exam3.app;

import exam3.model.Animal;
import exam3.model.Cat;
import exam3.model.Dog;

public class App {

  static void main() {
    Animal[] animals = new Animal[2];

    animals[0] = new Dog("Burek");
    animals[1] = new Cat("Miauczek");

    for (Animal a : animals) {
      System.out.print(a.getName() + " says: ");
      a.makeSound();
    }

  }

}


//W klasie App (main):
//stwórz tablicę Animal[] zawierającą co najmniej jednego Dog i jednego Cat,
//przejdź po niej pętlą i dla każdego zwierzęcia wypisz jego imię oraz wywołaj makeSound().