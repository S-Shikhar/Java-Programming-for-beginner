import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        int size = 10, max = 0, min = 0;

        int ar[] = new int[size];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("arr " + (i + 1) + ": ");
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (i == 0) {
                max = ar[i];
                min = ar[i];
            } else {
                if (ar[i] > max) {
                    max = ar[i];
                }
                if (ar[i] < min) {
                    min = ar[i];
                }
            }
        }

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);

        sc.close();
    }
}
