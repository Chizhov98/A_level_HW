package hw4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numArray = initializeIntArray(2000);
        zeros(numArray);
    }

    public static int[] initializeIntArray(int length) {
        int[] array  = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void zeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] % 2 == 0 ? 0 : array[i]);
        }
    }
}
