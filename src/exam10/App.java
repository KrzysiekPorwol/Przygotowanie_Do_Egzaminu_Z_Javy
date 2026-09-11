package exam10;

import exam10.model.BankAccount;

public class App {

  static void main() {
    BankAccount bankAccount = new BankAccount("Krzysztof Porwoł");

    bankAccount.depositBankAccount(400);
    bankAccount.depositBankAccount(600);

    System.out.println(bankAccount.getAccountBalance());

    bankAccount.withdrawBankAccount(800);

    System.out.println(bankAccount.getAccountBalance());

    bankAccount.withdrawBankAccount(-500);

    bankAccount.depositBankAccount(-500);

    System.out.println(bankAccount.getAccountBalance());

  }

}


//Cel: zrób prostą symulację konta bankowego.
//
//Funkcje, które ma spełniać:
//
//da się wpłacić pieniądze na konto,
//da się wypłacić pieniądze z konta,
//da się sprawdzić saldo,
//nie można wypłacić więcej, niż jest na koncie,
//nie można wpłacić ani wypłacić kwoty ujemnej (ani zera).
//
//Te dwie ostatnie sytuacje — próba niedozwolonej operacji — mają być obsłużone sensownie,
//tak żeby program nie policzył cichcem złego salda. W main pokaż, że wszystko działa,
//w tym co się dzieje, gdy ktoś spróbuje zrobić coś niedozwolonego (np. wypłacić za dużo).

//rzeczowniki: konto, pieniadze, saldo
//czasowniki: wpłącic pieniadze na konto, wyplacic pieniadze z konta, sprawdzić saldo.