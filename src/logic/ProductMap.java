//package logic;
//
//import model.Product;
//import model.ProductCategory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ProductMap {
//
//  private Map<String, Product> mapProducts;
//
//  public ProductMap() {
//    this.mapProducts = new HashMap<>();
//  }
//
//  public void addProduct(Product product) {
//    if (product == null) {
//      throw new IllegalArgumentException("Produkt nie może być null");
//    } else {
//      mapProducts.put(product.getName(), product);
//    }
//  }
//
//  public Product getProduct(String key) {
//    return mapProducts.get(key);
//  }
//
//  public void removeProduct(Product product) {
//    mapProducts.remove(product.getName());
//  }
//
//  public void showManyProductsInThisCategory(ProductCategory productCategory) {
//    if (productCategory.equals(mapProducts.))
//
//}
//
//
//
//}

//Mapa — policz, ile produktów przypada na każdą kategorię, przechodząc po katalogu.
//Wypisz wynik w formacie kategoria: N. (Przyda się to, czego nauczyłeś się o bezpiecznym odczycie
//z mapy przy nieistniejącym kluczu.)