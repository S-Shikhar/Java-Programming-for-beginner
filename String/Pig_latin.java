import java.util.Scanner;

public class Pig_latin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        str = str.trim().toUpperCase();
        int p = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                p = i;
                break;
            }
        }

        System.out.println(str.substring(p) + str.substring(0, p) + "AY");
    }
}
