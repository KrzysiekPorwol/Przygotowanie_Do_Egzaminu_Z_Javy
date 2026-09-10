package exam3.model;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}



//Dwie klasy dziedziczące po Animal:
//Dog — nadpisuje makeSound() tak, by wypisywało "Woof!",
//Cat — nadpisuje makeSound() tak, by wypisywało "Meow!".
//      (Pamiętaj o @Override i o wywołaniu konstruktora rodzica przez super(name).)