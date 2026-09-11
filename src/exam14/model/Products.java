package exam14.model;

public enum Products {
  WACHACZ, TULEJA, KIEROWNICA, LAMPA, DRZWI;

  @Override
  public String toString() {
    return name();
  }
}
