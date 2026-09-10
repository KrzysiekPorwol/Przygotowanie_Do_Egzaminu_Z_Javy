package exam4.App;

import exam4.model.Product;

public class App {

  static void main() {
    Product[] products = new Product[3];

    products[0] = new Product("Chleb", 2.99);
    products[1] = new Product("masło", 3.99);
    products[2] = new Product("bułka", 1.99);


    double sum = 0;
    double bigPrice = products[0].getPrice();
    String expensiveProduct = products[0].getName();

    for (Product p : products) {
      sum = sum + p.getPrice();
      if (bigPrice < p.getPrice()) {
        bigPrice = p.getPrice();
        expensiveProduct = p.getName();
      }
    }

    System.out.println("Łączna cena wszystkich produktów to: " + sum);
    System.out.println("Najdroższy produkt to " + expensiveProduct);


  }



}


//W klasie App (main):
//
//stwórz tablicę (albo listę) co najmniej trzech produktów, np. ("Bread", 4.50), ("Milk", 3.20), ("Cheese", 18.00),
//policz i wypisz łączną cenę wszystkich produktów,
//znajdź i wypisz nazwę najdroższego produktu.