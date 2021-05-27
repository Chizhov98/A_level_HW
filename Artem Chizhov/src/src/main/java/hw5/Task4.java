package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = Task2.initialiseIntArray(15);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Input index of the element that you want to delete (start from 0 )");
        int index = in.nextInt();
        if (index >= 0 && index < numbers.length) {
            System.out.println("New array: " + Arrays.toString(deleteOneElementOfArray(numbers, index)));
        } else {
            System.out.println("Index is incorrect ");
        }
    }

    public static int[] deleteOneElementOfArray(int[] numbers, int indexDelete) {
        int[] newNumbers = new int[numbers.length - 1];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != indexDelete) {
                newNumbers[j] = numbers[i];
                j++;
            }
        }
        return newNumbers;
    }


}
