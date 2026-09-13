package exam18.model;

import java.util.Objects;

public class Student {
  private String firstName;
  private String lastName;
  private String pesel;

  public Student(String firstName, String lastName, String pesel) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pesel = pesel;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPesel() {
    return pesel;
  }

  @Override
  public String toString() {
    return "Student{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", pesel='" + pesel + '\'' +
          '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(pesel, student.pesel);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(pesel);
  }
}
