package stringTraining;

import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        String[] words = getWordArray(string);
        System.out.println("Word count: " + words.length);

        System.out.println("Longest word: " + getLongestWord(words));

        System.out.println("Number of digits: " + digitCount(string));
    }

    public static String[] getWordArray(String inputString) {
        inputString = inputString.trim();

        return inputString.split("\\s+");
    }

    public static String getLongestWord(String[] words) {
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }

    public static int digitCount(String inputString) {
        int result = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isDigit(ch)) {
                result++;
            }
        }

        return result;
    }
}
