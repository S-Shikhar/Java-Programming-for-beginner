import java.util.Scanner;

public class ConsecutiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().toLowerCase();

        String[] words = s.split("\\s+");
        boolean found = false;

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                System.out.println("Consecutive word found: " + words[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No consecutive words found.");
        }
    }
}
