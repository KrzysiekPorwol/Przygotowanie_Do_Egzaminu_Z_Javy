package exam14.model;

import exam14.Exception.ProductNotInWarehouseException;
import exam14.Exception.ProductOutOfStockException;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

  Map<String, Integer> wareHouse = new HashMap<>();

  public void addProduct(Products product, int amount) {
    wareHouse.put(product.name(), amount);
  }

  public void deliveryProduct(Products product, int amount) {

    int getamount = wareHouse.getOrDefault(product.name(), 0);
    wareHouse.put(product.name(), (getamount + amount));
  }

  public void spendProduct(Products product, int amount) {
//    if (wareHouse.containsKey(product.name()))
    if (wareHouse.getOrDefault(product.name(), 0) == 0) {
      throw new ProductNotInWarehouseException("Brak tego produktu w magazynie.");
    }
    if (wareHouse.get(product.name()) - amount < 0) {
      throw new ProductOutOfStockException("Zbyt mało produktu na stanie");
    }

    wareHouse.put(product.name(), wareHouse.get(product.name()) - amount);
  }

  @Override
  public String toString() {
    return "Warehouse{" +
          "wareHouse=" + wareHouse +
          '}';
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