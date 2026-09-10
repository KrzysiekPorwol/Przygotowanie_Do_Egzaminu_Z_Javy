package exam8;

import exam8.model.TelephoneDirectory;

public class App {

  static void main() {

    TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

    telephoneDirectory.addContact("Krzysztof Porwoł", 668473269L);
    telephoneDirectory.addContact("Adam foltys", 648473269L);
    telephoneDirectory.addContact("maciej", 653473269L);
    telephoneDirectory.addContact("maciej2", 628473269L);

    System.out.println(telephoneDirectory.findNumber("Krzysztof Porwoł").toString());

    System.out.println("");

    telephoneDirectory.printAllContacts();

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