import java.util.Scanner;

public class Prime_to_zero {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace prime numbers with zero
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                arr[i] = 0;
            }
        }

        // Display the modified array
        System.out.print("Array after replacing prime numbers with zero: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
