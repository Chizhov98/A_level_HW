package hw7;

public class Task3 {
    public static void main(String[] args) {
        int arrayLength = 5;

        for (Vector element : Vector.vectorsArray(arrayLength)) {
            System.out.println(element.toString());
        }
    }
}
