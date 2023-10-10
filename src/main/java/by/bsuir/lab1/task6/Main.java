package by.bsuir.lab1.task6;

public class Main {
    public static double[][] takeMatrix (double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(j + i) % arr.length];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        double[][] matrix = takeMatrix(new double[] {5.6, 3.2, -2.0});

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
