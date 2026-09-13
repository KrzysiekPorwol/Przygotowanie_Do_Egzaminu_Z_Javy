package exam18;

import exam18.Exception.CourseDontHaveMoreSpaceException;
import exam18.Exception.ThisStudentAlreadyExistThisCourseException;
import exam18.model.Course;
import exam18.model.Student;

public class App {

  static void main() {

    Course python = new Course(3, "Python");

    Student student1 = new Student("Adam", "Foltys", "12345");
    Student student2 = new Student("Adam", "Foltys", "1234567");
    Student student3 = new Student("Adam", "Foltys", "123456");



    try {
      python.addStudent(student3);
    } catch (CourseDontHaveMoreSpaceException | ThisStudentAlreadyExistThisCourseException e) {
      System.out.println(e.getMessage());
    }

    try {
      python.addStudent(student3);
    } catch (CourseDontHaveMoreSpaceException | ThisStudentAlreadyExistThisCourseException e) {
      System.out.println(e.getMessage());
    }


    try {
      python.addStudent(student2);
    } catch (CourseDontHaveMoreSpaceException | ThisStudentAlreadyExistThisCourseException e) {
      System.out.println(e.getMessage());
    }

    try {
      python.addStudent(student1);
    } catch (CourseDontHaveMoreSpaceException | ThisStudentAlreadyExistThisCourseException e) {
      System.out.println(e.getMessage());
    }

    python.printAllStudents();

    python.removeStudent("123456");

    System.out.println("");

    python.printAllStudents();



  }

}


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