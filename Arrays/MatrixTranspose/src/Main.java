import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 2x3 matrix
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};

        int transpose[][] = new int[matrix[0].length][matrix.length];

        //transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        //printing transpose
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }

    }
}