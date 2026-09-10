package exam6.model;

public class Task {
  private String name;
  private boolean status = false;

  public Task(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return name + " | Czy zadanie wykonane: " + status;
  }
}



//Napisz aplikację symulującą listę zadań (to-do list).
//
//Aplikacja ma umożliwiać:
//
//dodanie nowego zadania,
//oznaczenie wybranego zadania jako zrobione,
//wypisanie wszystkich zadań wraz z ich statusem (zrobione / niezrobione).

// rzeczowniki: zadanie, status.
// cazsowniki: dodanie zadania, oznaczenie zadania, wypisanie wszystkich zadan wraz z ich statusem.