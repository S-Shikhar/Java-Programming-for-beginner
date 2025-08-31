import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int size = 10;

        int ar[] = new int[size];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("arr " + (i + 1) + ": ");
            ar[i] = sc.nextInt();
        }

        sc.close();

        int ar_even[] = new int[size];
        int ar_odd[] = new int[size];

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (ar[i] % 2 == 0) {
                ar_even[evenCount++] = ar[i];
            } else {
                ar_odd[oddCount++] = ar[i];
            }
        }

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(ar_even[i] + " ");
        }

        System.out.println("\nOdd numbers in the array:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(ar_odd[i] + " ");
        }
    }
}
