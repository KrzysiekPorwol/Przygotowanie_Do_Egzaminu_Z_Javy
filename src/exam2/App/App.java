package exam2.App;

import exam2.model.Rectangle;

public class App {

  static void main() {
    Rectangle rectangle1 = new Rectangle(4, 6);
    Rectangle rectangle2 = new Rectangle(5, 5);

    System.out.println("Ten prostokąt ma obwód " +
          rectangle1.getPerimeter() +
          ", jego pole wynosi " +
          rectangle1.getArea() +
          " Czy kwadrat? " +
          rectangle1.isSquare());

    System.out.println("Ten prostokąt ma obwód " +
          rectangle2.getPerimeter() +
          ", jego pole wynosi " +
          rectangle2.getArea() +
          " Czy kwadrat? " +
          rectangle2.isSquare());

  }


}



//stwórz dwa prostokąty — jeden zwykły (np. 4 × 6) i jeden kwadrat (np. 5 × 5),
//dla każdego wypisz na konsolę pole, obwód i informację, czy to kwadrat.