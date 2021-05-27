package hw5;

import java.util.Arrays;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = initialiseIntArray(10);
        Task1.sOutArray(numbers);
        System.out.println();
        Task1.sOutArray(toShuffle(numbers));

    }

    public static int[][] toShuffle(int[][] numbers) {
        int[][] newNumbers = new int[numbers.length][numbers[1].length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                newNumbers[i][j] = numbers[j][i];
            }
        }
        return newNumbers;
    }


    public static int[][] initialiseIntArray(int length) {
        int[][] numbers = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
            }
        }
        return numbers;
    }

}
