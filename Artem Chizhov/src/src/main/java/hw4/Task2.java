package hw4;

import java.util.Random;

public class Task2 {


    public static void main(String[] args) {
        int[] numArray = initializeIntArray(1000);
        System.out.println(primeCount(numArray));
    }

    public static int[] initializeIntArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int primeCount(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element >= 2 && checkPrime(element)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
