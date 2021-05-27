package hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        sOutArray(initialise(numbers));
    }

    public static void sOutArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] initialise(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i % 2 == 0) {
                    numbers[i][j] = j + 1;
                } else {
                    numbers[i][j] = -1 * j - 1;
                }
            }
        }
        return numbers;
    }
}
