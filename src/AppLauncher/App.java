package AppLauncher;

import model.Car;

public class App {

  static void main() {

    Car car = new Car("blue", "Mustang", 2.5);

    Car car1 = new Car();

    car.showInfo();
  }

}
