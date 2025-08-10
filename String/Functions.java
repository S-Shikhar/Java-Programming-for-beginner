// WAP to take an String input and count number of character, number of letters,

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int c = 0, l = 0, d = 0, s = 0, uc = 0, lc = 0, v = 0, con = 0, special = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        c = str.length(); // total characters

        for (int i = 0; i < c; i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                l++;
                if (Character.isUpperCase(ch)) {
                    uc++;
                } else {
                    lc++;
                }

                // Check for vowel
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    v++;
                } else {
                    con++;
                }

            } else if (Character.isDigit(ch)) {
                d++;
            } else if (Character.isWhitespace(ch)) {
                s++;
            } else {
                special++;
            }
        }

        // Print results
        System.out.println("Total characters: " + c);
        System.out.println("Total letters: " + l);
        System.out.println("Uppercase letters: " + uc);
        System.out.println("Lowercase letters: " + lc);
        System.out.println("Digits: " + d);
        System.out.println("Whitespace characters: " + s);
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + con);
        System.out.println("Special characters: " + special);
    }
}
