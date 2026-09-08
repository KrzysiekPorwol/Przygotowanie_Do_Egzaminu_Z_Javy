package model;

public class Car {
  String color;
  String name;
  double engineDisplacement;

  public Car(String color, String name, double engineDisplacement) {
    this.color = color;
    this.name = name;
    this.engineDisplacement = engineDisplacement;
  }

  public Car() {

  }

  public void showInfo() {
    System.out.print(name + " " + color + " " + engineDisplacement);
  }
}
