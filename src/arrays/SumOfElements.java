package arrays;

import java.util.Random;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix();

        System.out.println(printMatrix(matrix));
        System.out.println("Sum: " + findSum(matrix));
    }

    public static int findSum(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
            }
        }

        return result;
    }

    public static int[][] fillMatrix() {
        int[][] matrix = new int[3][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1000) + 1;
            }
        }

        return matrix;
    }

    public static String printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j])
                        .append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
