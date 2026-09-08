package logic;

public class If {

  public void methodIf() {
    int points = 0;
    if (points >= 90) {

    } else if (points >= 75) {

    } else if (points >= 50) {

    } else if (points < 50) {

    }
  }
}


//90 i więcej → "5"
//      75–89 → "4"
//      50–74 → "3"
//poniżej 50 → "2"