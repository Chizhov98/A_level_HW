package hw3;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, input some sentence please ");
        String someSentence = in.nextLine();
        System.out.println("Tour sentence without the spaces looks:" + spaceDel(someSentence));
        System.out.println("Yor sentence is" + (reversEcvals(someSentence) ? " a palindrome" : "n`t a palindrome"));
    }

    static public String spaceDel(String str) {

        return str.replaceAll("\\s", "");
    }

    public static boolean reversEcvals(String str) {
        str.toLowerCase(Locale.ROOT);
        String reverseStr = new StringBuffer(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
