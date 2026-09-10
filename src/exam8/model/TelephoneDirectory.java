package exam8.model;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {

  Map<String, Long> telephoneDirectory = new HashMap<>();

  public void addContact (String name, Long number) {
    telephoneDirectory.put(name, number);
  }

  public Contact findNumber(String name) {
    return new Contact(name, telephoneDirectory.get(name));
  }

  public void printAllContacts() {
    for (String k : telephoneDirectory.keySet()) {
      System.out.println(telephoneDirectory.get(k) + " | " + k);
    }
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

//rzeczowniki: ksiazka telefoniczna, kontakt, numer.
//czasowniki: dodanie kontaktu (imię + numer telefonu), wyszukanie numeru po imieniu, wypisanie wszyskich kontaktów.