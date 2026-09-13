package exam18.model;

import exam18.Exception.CourseDontHaveMoreSpaceException;
import exam18.Exception.ThisStudentAlreadyExistThisCourseException;

import java.util.HashMap;
import java.util.Map;

public class Course {

private String name;
private int maxUsers;
private Map<String, Student> students = new HashMap<>();

  public Course(int maxUsers, String name) {
    this.maxUsers = maxUsers;
    this.name = name;
  }

  public void addStudent(Student student) {
    if (students.size() >= maxUsers) {
      throw new CourseDontHaveMoreSpaceException("Nie ma już miejsca w tym kursie");
    } else if (students.get(student.getPesel()) != null) {
      throw new ThisStudentAlreadyExistThisCourseException("Ten student jest już zapisany na ten kurs");
    } else {
      students.put(student.getPesel(), student);
    }
  }

  public void removeStudent(String pesel) {
    students.remove(pesel);
  }

  public void printAllStudents() {
    for (Student s : students.values()) {
      System.out.println(s);
    }
  }

  public String getName() {
    return name;
  }

}

//ktoś próbuje zapisać się na kurs, który nie istnieje,
//ktoś próbuje się zapisać, gdy limit miejsc jest już wyczerpany,
//ktoś próbuje zapisać się na kurs, na którym już jest.



//Napisz prosty system zapisów na kursy. Ma się dać:
//
//utworzyć kurs z określonym limitem miejsc,
//zapisać studenta na kurs,
//wyświetlić listę studentów zapisanych na dany kurs,
//wypisać studenta z kursu.
//
//Zadbaj o sytuacje wyjątkowe — system ma sobie z nimi sensownie poradzić:
//
//ktoś próbuje zapisać się na kurs, który nie istnieje,
//ktoś próbuje się zapisać, gdy limit miejsc jest już wyczerpany,
//ktoś próbuje zapisać się na kurs, na którym już jest.

//rzeczowniki:
// kurs (okreslony limit miejsc),
// student,
// lista studentów,

//klasa kurs: okreslona lista miejsc (tablica posiadająca studentów)
//metody klasy kurs: zapisac studenta na kurs, wyswietlic liste studentów zapisanych na kurs, wypisac studenta z kursu.

//klasa student: (imie, nazwisko, pesel)

//czasowniki:
// utworzyć kurs,
// zapisac studenta na kurs,
// wyswietlic liste studentów zapisanych na kurs