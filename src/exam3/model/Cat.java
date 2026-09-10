package exam3.model;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Meow!");

  }
}
