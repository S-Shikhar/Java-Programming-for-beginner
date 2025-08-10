import java.util.Scanner;

public class first_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String str1 = ' ' + str;
        String w = ""; // To store the first letter of each word
        
        for (int i = 0; i < str.length(); i++){
            char ch = str1.charAt(i);

            if (ch == ' '){
                w = w + str1.charAt(i + 1);
            }
        }

        // Print the first letter of each word
        System.out.println("First letter of each word: " + w.trim());
            
    }
}
