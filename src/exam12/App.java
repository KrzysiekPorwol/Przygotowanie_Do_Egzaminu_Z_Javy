package exam12;

import exam12.Exception.IncompatibleLocationException;
import exam12.Exception.NoSeatsAvailableException;
import exam12.Exception.TicketSoledException;
import exam12.model.Ticket;
import exam12.model.TicketList;

public class App {

  static void main() {

    TicketList ticketList = new TicketList();

    try {
      ticketList.makeTicket(new Ticket());//1
      ticketList.makeTicket(new Ticket());//2
      ticketList.makeTicket(new Ticket());//3
      ticketList.makeTicket(new Ticket());//4
      ticketList.makeTicket(new Ticket());//5
      ticketList.makeTicket(new Ticket());//6
      ticketList.makeTicket(new Ticket());//7
      ticketList.makeTicket(new Ticket());//8
      ticketList.makeTicket(new Ticket());//9
      ticketList.makeTicket(new Ticket());//10
      ticketList.makeTicket(new Ticket());//11
      ticketList.makeTicket(new Ticket());// 12 - ten powinien nie zostać stworzony.
    } catch (NoSeatsAvailableException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

   for (int i = 1; i < ticketList.getTickets().length; i++) {
     System.out.println(ticketList.getTickets()[i]);
   }

    try {

      ticketList.buyTicket(6);
      ticketList.buyTicket(3);
      ticketList.buyTicket(15);// Ten powinien sie nie wykonac
      ticketList.buyTicket(6);// Ten powinien sie nie wykonac
      ticketList.buyTicket(1);
    } catch (IncompatibleLocationException | TicketSoledException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");
    for (int i = 1; i < ticketList.getTickets().length; i++) {
      System.out.println(ticketList.getTickets()[i]);
    }

    try {
      ticketList.sellTicket(6);
      ticketList.sellTicket(3);
      ticketList.sellTicket(1);
      ticketList.sellTicket(10);// Ten nie został kupiony - powinno się nic nie stać po prostu.
    } catch (IncompatibleLocationException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("");
    for (int i = 1; i < ticketList.getTickets().length; i++) {
      System.out.println(ticketList.getTickets()[i]);
    }




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