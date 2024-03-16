package com.adepuu;

public class Employee extends Person {
  private String jobTitle;

  public Employee(String name, int age, String jobTitle) {
    super(name, age); // Call the constructor of the superclass (Person)
    this.jobTitle = jobTitle;
  }

  // Getter for jobTitle
  public String getJobTitle() {
    return jobTitle;
  }

  // Setter for jobTitle
  public void setJobTitle(String jobTitle) {
    if (jobTitle == null || jobTitle.trim().isEmpty()) {
      throw new IllegalArgumentException("Job title cannot be null or empty");
    }
    this.jobTitle = jobTitle;
  }

  // Overriding the introduce method to include job title information
  @Override
  public void introduce() {
    System.out.println("Hello, my name is " + getName() + ", I am " + getAge() + " years old, and I work as a " + jobTitle + ".");
  }
}
