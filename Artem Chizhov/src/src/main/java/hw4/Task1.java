package hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] numArray = initializeIntArray(400);
        System.out.println("Среднее арифметичное :" + average(numArray));
        System.out.println("Среднее геометрическое " + geometricMean(numArray));
    }

    public static int[] initializeIntArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(12) + 1;
        }
        return array;
    }

    public static double average(int[] array) {
        double average = 0;
        for (int element : array) {
            average += element;
        }
        average /= array.length;
        return average;
    }

    public static double geometricMean(int[] array) {
        double mean = 1;
        for (int element : array) {
            mean *= element;
        }
        mean = Math.pow(mean, 1.0 / array.length);
        return mean;
    }
}
