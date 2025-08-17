import java.util.Scanner;

public class Consecitive_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String w = ""; // To store the first letter of each word
        str = str.trim() + " "; // Adding a space at the end to capture the last word

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' '){
                w = w + ch; // Append the character to w
            }else {
                int count = 0;
                for (int j = 0; j < w.length() - 1; j++) {
                    char ch1 = w.charAt(j);
                    char ch2 = w.charAt(j + 1);

                    if ((char) ((int) ch1 + 1) == ch2) {
                        count = 1;
                        break;
                    }
                }
                if (count == 1) {
                    System.out.println("Consecutive characters found: " + w);
                } else {
                    System.out.println("No consecutive characters found.");
                }
                w = ""; // Reset w for the next word
            }
        }
    }
}
