package arrays;

import java.util.Random;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix();

        System.out.println(printMatrix(matrix));
        System.out.println("Sum: " + findSum(matrix));

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            stringBuilder
                    .append("Row ").append(i + 1).append(": sum = ").append(findRowSum(matrix[i]))
                    .append(" Min: ").append(rowMin(matrix[i]))
                    .append("\n");
        }

        System.out.println(stringBuilder);

        int[][] transposedMatrix = transpositionMatrix(matrix);
        System.out.println(printMatrix(transposedMatrix));
    }

    public static int[][] transpositionMatrix(int[][] matrix) {
        int[][] resultMatrix = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[j][i] = matrix[i][j];
            }
        }

        return resultMatrix;
    }

    public static int rowMin(int[] rowArray) {
        int result = 0;
        if (rowArray.length >= 1) {
            result = rowArray[0];
        }
        for (int i = 0; i < rowArray.length; i++) {
            if (result >= rowArray[i]) {
                result = rowArray[i];
            }
            ;
        }

        return result;
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

    public static int findRowSum(int[] rowArray) {
        int result = 0;
        for (int i = 0; i < rowArray.length; i++) {
            result += rowArray[i];
        }

        return result;
    }

    public static int[][] fillMatrix() {
        int[][] matrix = new int[3][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
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
