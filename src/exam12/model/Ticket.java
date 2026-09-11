package exam12.model;

public class Ticket {
  private int place;
  private boolean reservation = false;
  private static int count = 1;

  public Ticket() {
    this.place = count;
    count++;
  }

  public int getPlace() {
    return place;
  }

  public void setPlace(int place) {
    this.place = place;
  }

  public boolean isReservation() {
    return reservation;
  }

  public void setReservation(boolean reservation) {
    this.reservation = reservation;
  }

  @Override
  public String toString() {
    return "Ticket{" +
          "place=" + place +
          ", reservation=" + reservation +
          '}';
  }
}
