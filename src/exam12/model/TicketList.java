package exam12.model;

import exam12.Exception.IncompatibleLocationException;
import exam12.Exception.TicketSoledException;

public class TicketList {

  private Ticket[] tickets = new Ticket[11];
  private static int count = 1;

  public void makeTicket(Ticket ticket) {
    if (count > 11) {
      throw new ArrayIndexOutOfBoundsException("Brak miejsc na sali - wszystkie bilety zostały wyprodukowane.");
    }
    tickets[count] = ticket;
    count++;
  }

  public void buyTicket(int place) {
    if (place > tickets.length || place < 1) {
      throw new IncompatibleLocationException("Podałeś niepoprawny numer siedzenia");
    }
    if (tickets[place].isReservation()) {
      throw new TicketSoledException("Bilet o takim numerze jest już sprzedany!");
    }
      tickets[place].setReservation(true);
  }

  public void sellTicket(int place) {
    if (place > tickets.length || place < 1) {
      throw new IncompatibleLocationException("Podałeś niepoprawny numer siedzenia");
    }
    tickets[place].setReservation(false);
  }

  public int getCount() {
    return count;
  }

  public Ticket[] getTickets() {
    return tickets;
  }
}

//Cel: zrób prosty system rezerwacji miejsc na sali kinowej.
//
//Funkcje:
//
//sala ma z góry określoną liczbę miejsc (np. 10), numerowanych,
//da się zarezerwować miejsce o podanym numerze,
//da się zwolnić rezerwację miejsca,
//nie można zarezerwować miejsca, które jest już zajęte,
//nie można zarezerwować ani zwolnić miejsca o numerze spoza zakresu sali
// (np. 0, -3, albo 999 przy sali na 10 miejsc).
//
//W main pokaż, że wszystko działa — w tym co się dzieje przy każdej próbie niedozwolonej operacji
// (miejsce zajęte, numer poza zakresem). Program ma reagować sensownie, nie liczyć bzdur i nie
// wywalać się na czerwono.

//rzeczowniki: sala, liczba miejsc (10, numerowanych)
//czasownik:  zarezerwować miejsce o podanym numerze, zwolnić rezerwacje,