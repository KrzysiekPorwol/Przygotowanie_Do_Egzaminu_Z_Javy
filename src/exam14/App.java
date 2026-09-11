package exam14;

import exam14.Exception.ProductNotInWarehouseException;
import exam14.Exception.ProductOutOfStockException;
import exam14.model.Products;
import exam14.model.Warehouse;

public class App {

  static void main() {

    Warehouse warehouse = new Warehouse();

    warehouse.addProduct(Products.KIEROWNICA, 40);
    warehouse.addProduct(Products.TULEJA, 30);
    warehouse.addProduct(Products.LAMPA, 20);
    warehouse.addProduct(Products.WACHACZ, 10);


    System.out.println(warehouse);

    try {
      warehouse.spendProduct(Products.DRZWI, 50);
    } catch (ProductNotInWarehouseException | ProductOutOfStockException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");
    System.out.println(warehouse);

    warehouse.addProduct(Products.DRZWI, 30);
    try {
      warehouse.spendProduct(Products.DRZWI, 50);
    } catch (ProductNotInWarehouseException | ProductOutOfStockException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");
    System.out.println(warehouse);



  }



}


//Funkcje:
//
//da się dodać produkt do magazynu z jego początkowym stanem (liczbą sztuk),
//da się zwiększyć stan istniejącego produktu (przyjęcie dostawy),
//da się wydać określoną liczbę sztuk danego produktu,
//nie można wydać więcej sztuk, niż jest w magazynie,
//nie można operować na produkcie, którego w magazynie nie ma.
//
//W main pokaż, że wszystko działa — w tym każdą próbę niedozwolonej operacji osobno
//      (wydanie za dużej liczby sztuk, operacja na nieistniejącym produkcie).
//Program ma reagować sensownie, nie liczyć bzdur i nie wywalać się na czerwono.

//rzeczownik: produkt (liczba sztuk), magazyn,
//Czasownik: zwiekszyc stan produktu, wydać okreslona liczbe sztuk produktu,
// (nie mozna wydac wiecej niz w magaznie, nie mozna operowac na produkcie ktorego nie ma)