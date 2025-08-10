import java.util.Scanner;

public class replace {
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
            }else {
                if (w.equalsIgnoreCase("the") == true) { 
                    w1 = w1 + "this" + " "; // Replace "the" with "a"
                }else {
                    w1 = w1 + w + " "; // Keep the word as is
                }
                w = ""; // Reset w for the next word
            }
        }

        // Print the modified string
        System.out.println("Modified string: " + w1.trim());
    }
}     

