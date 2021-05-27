package hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your number please");
        int number = in.nextInt();
        System.out.println("The mirror image of your number( " + number + ") is " + mirror(number));
    }

    static int mirror(int num) {
        int length = Integer.toString(num).length();
        int result[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                result[i] = num;
            } else {
                result[i] = num % 10;
            }
            num = num / 10;
        }

        int res = 0;
        for (int i = 1, j = 1; i <= length; i++, j = j * 10) {
            res = res + result[length - i] * j;
        }

        return res;
    }
}
