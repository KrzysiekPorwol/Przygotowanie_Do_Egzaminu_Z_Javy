package exam10.model;

public class BankAccount {
  private String name;
  private int accountBalance = 0;

  public BankAccount(String name) {
    this.name = name;
  }

  public void withdrawBankAccount(int accountBalance) {
    if (accountBalance <= 0) {
      System.out.println("Nie można wypłacić z konta mniej od 0 lub 0!");
    } else {
      this.accountBalance = this.accountBalance - accountBalance ;
    }
  }

  public void depositBankAccount(int accountBalance) {
    if (accountBalance <= 0) {
      System.out.println("Nie można wpłacić na konto mniej od 0 lub 0!");
    } else {
      this.accountBalance = this.accountBalance + accountBalance ;
    }
  }

  public int getAccountBalance() {
    return accountBalance;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "BankName: " + name + " AccountBalance: " + accountBalance;
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