import java.util.Scanner;

public class Maximum_number_of_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        str = str.trim().toUpperCase() + ' '; // Convert to uppercase for easier vowel checking
        String w = "";
        String w1 = "";
        int count = 0, max = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                w = w + ch;
            } else {
                for (int j = 0; j < w.length(); j++) {
                    char ch1 = w.charAt(j);
                    if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
                        count++;
                    }
                }
                if (count > max) {
                    max = count; 
                    w1 = w;
                }
                w = "";
                count = 0;
            }
        }

        System.out.println("Word with maximum number of vowels: " + w1); // Print the word with maximum vowels
        System.out.println("Number of vowels in that word: " + max); // Print the count of vowels in that word
    }
}
