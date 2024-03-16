package com.adepuu;

public class OOP {
  public static void main(String[] args) {
    Person person = new Person("John",  30);
    person.introduce();
    person.setName("John Doe"); // Using setter to set the name
    System.out.println(person.getName()); // Using getter to retrieve the name

    Employee employee = new Employee("Foo", 20, "SDE");
    System.out.println(employee.getAge());
    employee.introduce();
  }
}