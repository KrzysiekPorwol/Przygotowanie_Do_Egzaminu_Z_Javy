package exam2.model;

public class Rectangle {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }

  public boolean isSquare() {
    if (height == width) {
      return true;
    } else
      return false;
  }
}


//Napisz klasę Rectangle (prostokąt), która ma:
//
//dwa prywatne pola: width (double), height (double),
//konstruktor przyjmujący oba wymiary,
//gettery do obu pól,
//metodę getArea(), która zwraca (nie wypisuje!) pole prostokąta (width * height),
//metodę getPerimeter(), która zwraca obwód (2 * (width + height)),
//metodę isSquare(), która zwraca true, jeśli prostokąt jest kwadratem (szerokość równa wysokości), a w przeciwnym razie false.