package AppLauncher;

import logic.ProductList;
import model.Product;
import model.ProductCategory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShopApp {

  static void main() {
    ProductCategory[] tablica = new ProductCategory[3];

    tablica[0] = ProductCategory.MEATS;
    tablica[1] = ProductCategory.VEGETABLES;
    tablica[2] = ProductCategory.FRUITS;

    for (ProductCategory pc : tablica) {
      System.out.println(pc);
    }

    ProductList productList = new ProductList();

    productList.addProduct(new Product("Ham", tablica[0], 29.99));
    productList.addProduct(new Product("Ham2", tablica[0], 39.99));
    productList.addProduct(new Product("Apple", tablica[2], 9.99));
    productList.addProduct(new Product("Strawberry", tablica[2], 19.99));
    productList.addProduct(new Product("Cucumber", tablica[1], 4.99));

    productList.showProduct();


//    ProductMap productMap = new ProductMap();

    Map<String, Product> mapProducts = new HashMap<>();

    mapProducts.put(productList.getProduct(0).getName(), productList.getProduct(0));
    mapProducts.put(productList.getProduct(1).getName(), productList.getProduct(1));
    mapProducts.put(productList.getProduct(2).getName(), productList.getProduct(2));
    mapProducts.put(productList.getProduct(3).getName(), productList.getProduct(3));
    mapProducts.put(productList.getProduct(4).getName(), productList.getProduct(4));


    Map<ProductCategory, Integer> howManyThisCategory = new HashMap<>();
    for (Product p : mapProducts.values()) {

      howManyThisCategory.put(p.getCategory(), howManyThisCategory.getOrDefault(p.getCategory(), 0) + 1);

    }

    for (ProductCategory k : howManyThisCategory.keySet()) {
      System.out.println(k + " : " + howManyThisCategory.get(k));
    }

    Set<ProductCategory> productSet = new HashSet<>();

    for (Product p : mapProducts.values()) {
      productSet.add(p.getCategory());
    }

    for (ProductCategory p : productSet) {
      System.out.println(p);
    }

    System.out.println("This set have " + productSet.size() + " category");

  }

}
//Zbiór — zbierz unikalne kategorie faktycznie występujące w katalogu i wypisz ich liczbę oraz zawartość.
//      Zwróć uwagę, czy liczba zgadza się z tym, czego się spodziewasz po swoich 5 produktach.