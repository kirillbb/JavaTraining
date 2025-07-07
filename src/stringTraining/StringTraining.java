package stringTraining;

import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        System.out.println("Word count:" + getWordArray(string).length);
    }

    public static String[] getWordArray(String inputString) {
        inputString = inputString.trim();

        return inputString.split("\\s+");
    }
}
