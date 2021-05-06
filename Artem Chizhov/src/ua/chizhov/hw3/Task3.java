package ua.chizhov.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, input the some sentence please:");
        String someSentence = in.nextLine();
        System.out.print(countOfWords(someSentence.trim()));
    }

    public static String countOfWords(String str) {
        str = str.replaceAll(" +", " ");
        System.out.print(str);
        System.out.println('.');
        int count = 1;
        if (str.length() == 0) {
            count = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        switch (count) {
            case 0:
                return "You only entered spaces, no words ";


            case 1:
                return "There is only one word in your sentence";


            default:
                return "There are " + count + " words in your sentence";
        }


    }
}
