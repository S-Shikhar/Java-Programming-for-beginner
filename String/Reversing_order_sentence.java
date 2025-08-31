import java.util.Scanner;

public class Reversing_order_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String reversed = ""; // To store the reversed string

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        System.out.println("Reversed string: " + reversed); // Print the reversed string
    }
}
