import java.util.Scanner;

public class Matrix_addition {
    public static void main(String[] args) {
        int rows1, cols1, rows2, cols2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of Matrix1: ");
        rows1 = sc.nextInt();
        System.out.print("Enter number of columns of Matrix1: ");
        cols1 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of rows of Matrix2: ");
        rows2 = sc.nextInt();
        System.out.print("Enter number of columns of Matrix2: ");
        cols2 = sc.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
            return;
        }

        int[][] sumMatrix = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
