import java.util.Scanner;

public class Max_min_interchange {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0, maxIndex = 0;
        int min = 0, minIndex = 0;

        // Find indices of maximum and minimum elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        // Interchange maximum and minimum elements
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        // Display the modified array
        System.out.print("Array after interchanging max and min: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
