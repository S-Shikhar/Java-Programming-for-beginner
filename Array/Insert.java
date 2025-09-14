import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int[] arr = new int[11];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert: ");
        int position = sc.nextInt();
        position = position - 1; // Adjusting for 0-based index
        System.out.println("Enter the element to insert: ");
        int element = sc.nextInt();

        // Shift elements to the right to make space for the new element
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;

        // Display the modified array
        System.out.print("Array after insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
