import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int size = 10;

        int ar[] = new int[size];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("arr " + (i + 1) + ": ");
            ar[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += ar[i];
        }

        System.out.println("Sum of the array is: " + sum);

        sc.close();
    }
}
