package exam6;

import exam6.model.Task;
import exam6.model.TaskList;

public class App {

  static void main() {

    TaskList taskList = new TaskList();

    taskList.addTask(new Task("Napraw zmywak"));
    taskList.addTask(new Task("Przytnij trawę"));
    taskList.addTask(new Task("Wymieś śmieci"));

    taskList.printAllTasks();

    taskList.getTask(1).setStatus(true);

    System.out.println("");

    taskList.printAllTasks();




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