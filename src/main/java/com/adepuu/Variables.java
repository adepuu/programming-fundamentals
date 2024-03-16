package com.adepuu;

public class Variables {
  private final int x = 1;

  public static void main(String[] args) {
    int age;
    age = 25;
    double salary = 50000.00;
    char grade = 'A';
    boolean isMarried = false;
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    System.out.println("Grade: " + grade);
    System.out.println("Is Married: " + isMarried);

    int[] ages = {25, 30, 35};
    double[] salaries = {50000.00, 60000.00, 70000.00};
    char[] grades = {'A', 'B', 'C'};
    boolean[] maritalStatuses = {true, false, true};
    for (int i = 0; i < ages.length; i++) {
      System.out.println("Age: " + ages[i] + ", Salary: " + salaries[i] + ", Grade: " + grades[i] + ", Is Married: " + maritalStatuses[i]);
    }
  }
}
