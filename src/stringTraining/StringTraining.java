package stringTraining;

import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        System.out.println("Word count:" + wordCount(string));
    }

    public static int wordCount(String inputString) {
        inputString = inputString.trim();
        String[] words = inputString.split("\\s+");

        return words.length;
    }
}
