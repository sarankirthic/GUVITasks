// Branching and Looping Statements

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();

    }

// Question 1:
// Write a program to print the numbers from 10 to 50 using for loop/while loop

    public static void question1() {
        System.out.println("Question 1");
        int number = 10;
        while (number <= 50) {
            System.out.println(number);
            number += 1;
        }
    }

// Question 2
// Write down the program to reverse the given number using loops

    public static void question2() {
        System.out.println("Question 2");
        System.out.println("Enter number to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        int length = input.length();
        for(int i = length - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        System.out.println("Reversed Number: " + output);
    }

// Question 3
// Write a program that find a given number is negative or positive

    public static void question3() {
        System.out.println("Question 3");
        System.out.println("Enter number to be checked if negative or positive: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

// Question 4
// Write a program to find the smallest number among three numbers

    public static void question4() {
        System.out.println("Question 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int smallest = 0;
        for (int i = 0; i < 3; i++) {
            if (a < b) {
                smallest = a;
                if (a > c) {
                    smallest = c;
                }
            }
            else {
                smallest = b;
                if (b > c) {
                    smallest = c;
                }
            }
        }
        System.out.println("Smallest Number is : " + smallest);
    }

// Question 5
// Write a java Program that takes the purchase amount as input and calculates the final payable amount after applying the discount
// 1. If the purchase amount is less than 500, no discount is applied
// 2. If the purchase amount is between 500 and 1000, a 10% discount is applied
// 3. If the purchase amount is greater than 1000 a 20% discount is applied

    public static void question5() {
        System.out.println("Question 5");
        Scanner scanner = new Scanner(System.in);
        double finalAmount = 0.0;
        System.out.println("Print the purchase amount: ");
        int purchaseAmount = scanner.nextInt();
        if (purchaseAmount < 500) {
            finalAmount = purchaseAmount;
        } else if (purchaseAmount < 1000) {
            finalAmount = purchaseAmount * 0.9;
        } else {
            finalAmount = purchaseAmount * 0.8;
        }
        System.out.println("Final purchase amount: " + finalAmount);
    }

//    Question 6
//    Print the pattern

//    5 5 5 5 5
//    5 4 4 4 4
//    5 4 3 3 3
//    5 4 3 2 2
//    5 4 3 2 1

    public static void question6() {
        System.out.println("Question 6");
        int n = 5;
        for(int i = 0; i < n; i++) {
            int value = n;
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(value-- + " ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

}

