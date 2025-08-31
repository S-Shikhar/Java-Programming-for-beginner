import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int size = 10;

        int ar[] = new int[size];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("arr " + (i + 1) + ": ");
            ar[i] = sc.nextInt();
        }

        
        System.out.print("Enter the number to search: ");
        int searchValue = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (ar[i] == searchValue) {
                System.out.println("Number " + searchValue + " found at index: " + i);
                break;
            }
        }
        
        sc.close();
    }
}
