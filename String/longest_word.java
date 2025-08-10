
import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        int maxLength = 0;
        String w = ""; // To store the first letter of each word
        String w1 = ""; 
        str = str.trim() + " "; // Adding a space at the end to capture the last word

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                w = w + ch; // Append the character to w
            }else {
                if (w.length() > maxLength) {
                    maxLength = w.length();
                    w1 = w; // Store the longest word found so far
                }
                w = ""; // Reset w for the next word
            }
        }

        System.out.println("Longest word: " + w1);
    }

}