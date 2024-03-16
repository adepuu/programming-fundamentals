package com.adepuu;

public class Functions {
    public static void main(String[] args) {
        int sum = add(5,  10);
        System.out.println("Sum: " + sum);

        int[] numbers = {1,  2,  3,  4,  5};
        int sum2 =  0;
        for (int number : numbers) {
            sum2 = add(sum2, number);
        }
        System.out.println("Sum: " + sum2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
