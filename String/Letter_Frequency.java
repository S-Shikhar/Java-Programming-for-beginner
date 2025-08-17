import java.util.Scanner;

public class Letter_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        str = str.trim().toLowerCase() + ' '; // Trim and convert to lowercase

        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0; // Initialize count for each letter
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == i) {
                    count++; // Increment count if character matches
                }
            }
            if (count > 0) {
                System.out.println("Frequency of '" + i + "': " + count); // Print frequency
            }
        }
    }
}
