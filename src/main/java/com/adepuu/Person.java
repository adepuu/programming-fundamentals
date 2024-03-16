package com.adepuu;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // Setter for name
  public void setName(String name) {
    // Validation logic can be added here
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    this.name = name;
  }

  public void introduce() {
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
  }
}