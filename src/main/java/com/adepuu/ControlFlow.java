package com.adepuu;

import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
//    int number =  10;
//    if (number >  0) {
//      System.out.println("Number is positive.");
//    } else {
//      System.out.println("Number is not positive.");
//    }

//    for (int i = 0; i < 5; i++) {
//      System.out.println("Hello, World! " + i);
//    }
//
//    int[] numbers = {10, -5,  0,  20};
//    for (int number : numbers) {
//      if (number >  0) {
//        System.out.println(number + " is positive.");
//      } else if (number <  0) {
//        System.out.println(number + " is negative.");
//      } else {
//        System.out.println(number + " is zero.");
//      }
//    }

    Scanner scanner = new Scanner(System.in);
    String input;

    do {
      System.out.println("Enter a value (type 'exit' to quit):");
      input = scanner.nextLine();
    } while (!input.equalsIgnoreCase("exit"));

    System.out.println("You entered: " + input);
    scanner.close();
  }
}
