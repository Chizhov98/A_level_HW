package ua.cizhov.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number please: ");
        int number = in.nextInt();
        System.out.println("The number (" + number + ") " + (isEven(number) ? "is even" : "isn`t even"));
    }

    public static boolean isEven(int num) {
        boolean even = (num % 2 == 0 ? true : false);
        return even;
    }
}
