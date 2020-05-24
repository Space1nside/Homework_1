package Homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//lol

        System.out.println("Enter 4 values");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(valueOfNum(a, b, c, d));
// hi
        System.out.println("Enter 2 values for checking if their sum is in range between 10 to 20");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        rangeSum(num1, num2);

        System.out.println("Enter 1 value for checking if they are positive or negative");
        int posOrNegNum = scanner.nextInt();
        positiveNegative(posOrNegNum);

        System.out.println("Enter 1 value for checking if it is negative");
        int negNum = scanner.nextInt();
        negativeNum(negNum);

        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String personName = lineScanner.nextLine();
        greeting(personName);

        System.out.print("Enter the year - ");
        int year = scanner.nextInt();
        leapYear(year);
    }

    //the value of a * (b + (c / d))
    public static int valueOfNum (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Checking if the sum of two values is between the range from 10 to 20
    public static void rangeSum (int firstNum, int secondNum) {
        int total = firstNum + secondNum;

        if(total >= 10 && total <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Checking if the number is positive or negative
    public static void positiveNegative (int number) {
        if(number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    //Checking if the number is negative
    public static void negativeNum (int number) {
        if(number < 0) {
            System.out.println("True");
        }
    }

    public static void greeting (String name) {
        System.out.println("Hello, " + name + "!");
    }

    //Checking if the year is a leap year
    public static void leapYear (int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
