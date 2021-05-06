package ua.cizhov.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much nambers do you want input? ");
        int[] num = new int[in.nextInt()];
        System.out.println("Input this numbers please: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + " number is : ");
            num[i] = in.nextInt();
        }

        int tempArray[] = less(num);
        int resalt[] = new int[tempArray[tempArray.length - 1]];
        for (int i = 0; i < resalt.length; i++) {
            resalt[i] = tempArray[i];
        }

        System.out.println(" The less absolute value of your numbers" + (tempArray[tempArray.length - 1] > 1 ? " are:" : " is: "));
        for (int i = 0; i < resalt.length; i++) {
            System.out.println(resalt[i]);
        }
    }

    public static int[] less(int[] num) {
        int count = 0;
        int[] lessNumber = new int[num.length + 1];
        lessNumber[0] = num[0];
        for (int i = 0; i < num.length; i++) {
            if (mod(num[i]) < mod(num[count])) {
                count = i;
            }
        }
        for (int i = 0, j = 0; i < num.length; i++) {
            if (mod(num[i]) == mod(num[count])) {
                lessNumber[j] = num[i];
                j++;
                lessNumber[num.length] = j;
            }
        }
        return lessNumber;
    }

    //Вычисление модуля числа
    public static int mod(int num) {
        num = (num < 0 ? num * -1 : num);
        return num;
    }
}
