import java.util.Scanner;

public class Sum_diagonal_elemets {
    public static void main(String[] args) {
        int rows, cols;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        if (rows != cols) {
            System.out.println("Matrix is not square. Diagonal sum is not defined.");
            return;
        }

        int leftdiagonalSum = 0;
        int rightdiagonalSum = 0;

        for (int i = 0; i < rows; i++) {
            leftdiagonalSum += matrix[i][i];
            rightdiagonalSum += matrix[i][rows - 1 - i];
        }

        System.out.println("Sum of left diagonal elements: " + leftdiagonalSum);
        System.out.println("Sum of right diagonal elements: " + rightdiagonalSum);
    }
}
