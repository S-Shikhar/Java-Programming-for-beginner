import java.util.Scanner;

public class String_linear_search {
    public static void main(String[] args) {
        String[] country_names = new String[5];
        String[] wonders = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 country names and their corresponding wonders:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Country " + (i + 1) + ": ");
            country_names[i] = sc.nextLine();
            System.out.print("Wonder " + (i + 1) + ": ");
            wonders[i] = sc.nextLine();
        }

        System.out.print("Enter the country name to search: ");
        String searchCountry = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (country_names[i].equalsIgnoreCase(searchCountry)) {
                System.out.println("Wonder of " + searchCountry + " is: " + wonders[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Country " + searchCountry + " not found.");
        }
    }
}
