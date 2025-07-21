package wrapper_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WrapperClassTraining {

    public static void main(String[] args) {
        difference();

        System.out.println(squareInt(userInputInt()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("12", "8", "13", "5"));
        System.out.println(getlistSum(list));
    }

    public static void difference() {
        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 128;
        Integer d = 128;

        System.out.println(c == d);
        System.out.println(c.equals(d));

        Integer e = 222;
        Integer f = 222;

        System.out.println(e == f);
        System.out.println(e.equals(f));
    }

    public static int squareInt(Integer number) {
        return number * number;
    }

    public static int userInputInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getlistSum(ArrayList<String> list) {
        int result = 0;
        for (String str : list) {
            result += Integer.parseInt(str);
        }

        return result;
    }
}
