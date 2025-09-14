import java.util.Scanner;

public class Sec_largest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int firstLargest = 0;
        int secondLargest = 0;

        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest element is: " + secondLargest);
    }
}
