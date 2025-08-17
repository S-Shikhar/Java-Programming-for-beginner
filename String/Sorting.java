import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String w1 = ""; // To store the sorted characters
        str = str.trim().toLowerCase() + ' '; // Trim and convert to lowercase

        for (char i = 'a'; i <= 'z'; i++) {

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == i) {
                    w1 = w1 + ch; // Append the character to w1
                }
            }

        }
        System.out.println("Sorted characters: " + w1.trim()); // Print the sorted characters
    }
}
