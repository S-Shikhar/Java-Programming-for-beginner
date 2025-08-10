// WAP to input a sentence and print only the palindrome words from it.

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String w = ""; // To store the first letter of each word
        String w1 = ""; // To store the last letter of each word
        str = str.trim() + " "; // Adding a space at the end to capture the last word

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' '){
                w = w + ch; // Append the character to w
                w1 = ch + w1;
            }else{
                if (w.equalsIgnoreCase(w1) == true) { 
                    System.out.println("Palindrome word: " + w);
                }
                w = ""; // Reset w for the next word
                w1 = ""; // Reset w1 for the next word
            }
        }
    }   
}
