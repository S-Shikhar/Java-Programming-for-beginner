import java.util.Scanner;

public class Double_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (ch == str.charAt(i + 1)) {
                
            }
        }   
    }
}
