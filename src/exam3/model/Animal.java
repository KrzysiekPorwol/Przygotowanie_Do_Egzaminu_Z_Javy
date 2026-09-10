package exam3.model;

public class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void makeSound() {
    System.out.println("Some generic animal sound");
  }
}


//Klasa bazowa Animal:
//prywatne pole name (String),
//konstruktor przyjmujący name,
//getter getName(),
//metoda makeSound(), która wypisuje coś ogólnego, np. "Some generic animal sound".