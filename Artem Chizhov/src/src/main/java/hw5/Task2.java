package hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // int[] numbers = {9,9,9,9,8,8,8,8,8,5,2,1,0}; // always true
        int[] numbers = initialiseIntArray(15); // 98+ % false
        System.out.println(Arrays.toString(numbers));
        System.out.println("The array is not ascending:" + unAscending(numbers));
    }

    public static boolean unAscending(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] initialiseIntArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
