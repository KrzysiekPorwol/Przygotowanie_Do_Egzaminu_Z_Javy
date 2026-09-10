package exam8.model;

import java.util.Objects;

public class Contact {
  private long phoneNumber;
  private String name;

  public Contact(String name, long phoneNumber) {
    this.phoneNumber = phoneNumber;
    this.name = name;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " : " + phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Contact contact = (Contact) o;
    return phoneNumber == contact.phoneNumber && Objects.equals(name, contact.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, name);
  }
}


//Napisz aplikację — książkę telefoniczną (contact book).
//
//Aplikacja ma umożliwiać:
//
//dodanie kontaktu (imię + numer telefonu),
//wyszukanie numeru po imieniu,
//wypisanie wszystkich kontaktów.
//
//Pokaż w main, że wszystkie trzy funkcje działają.

//rzeczowniki: ksiazka telefoniczna, kontakt, numer. (imie).
//czasowniki: dodanie kontaktu (imię + numer telefonu), wyszukanie numeru po imieniu, wypisanie wszyskich kontaktów.