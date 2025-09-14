import java.util.Scanner;

public class SelectionSort_names {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Selection sort algorithm to sort names in ascending order
        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap names[i] and names[minIndex]
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }

        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
