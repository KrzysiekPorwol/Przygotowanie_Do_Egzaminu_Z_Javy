package exam6.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

  private List<Task> taskList = new ArrayList<>();

  public void addTask(Task task) {
    taskList.add(task);
  }

  public Task getTask(int numberOfTask) {
    return taskList.get(numberOfTask);
  }

  public void printAllTasks() {
    for (Task t : taskList) {
      System.out.println(t.toString());
    }
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