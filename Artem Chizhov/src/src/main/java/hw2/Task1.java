package hw2;

import java.util.Scanner;

public class Task1 {


    public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Task2
            int x1 = -1, x2 = -4, x3 = -10;
            int y1 = 1, y2 = 6, y3 = 2;

            System.out.println("The area of triangle with coordinates (" + x1 + "," + y1 + "; " + x2 + "," + y2 + "; " + x3 + "," + y3 + "; is:" + square(x1, x2, x3, y1, y2, y3));

        }

        public static double square(int x1, int x2, int x3, int y1, int y2, int y3) {
            double square, sideA, sideB, sideC, p;

            sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            sideB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            sideC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            p = (sideA + sideB + sideC) / 2;
            square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return square;
        }


    }
}