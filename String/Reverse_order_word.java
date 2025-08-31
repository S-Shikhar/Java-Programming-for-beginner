import java.util.Scanner;

public class Reverse_order_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String reversedWords = ""; // To store the reversed words
        String[] words = str.trim().split(" "); // Split the string into words

        // Loop through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords += words[i]; // Append each word to the reversed string
            if (i != 0) {
                reversedWords += " "; // Add a space between words
            }
        }

        System.out.println("Reversed order of words: " + reversedWords); // Print the reversed order of words
    }
}
