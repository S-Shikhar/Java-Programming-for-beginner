import java.util.Scanner;

public class Third_array {
    public static void main(String[] args) {
        int[] P = new int[6];
        int[] Q = new int[4];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 6 elements for array P:");
        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }

        System.out.println("Enter 4 elements for array Q:");
        for (int i = 0; i < Q.length; i++) {
            Q[i] = sc.nextInt();
        }

        int[] R = new int[P.length + Q.length];

        // Copy elements of P to R
        for (int i = 0; i < P.length; i++) {
            R[i] = P[i];
        }

        // Copy elements of Q to R
        for (int i = 0; i < Q.length; i++) {
            R[P.length + i] = Q[i];
        }

        // Display the resultant array R
        System.out.print("Resultant array R: ");
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
    }
}