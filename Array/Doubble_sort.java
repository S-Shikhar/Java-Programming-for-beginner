import java.util.Scanner;

public class Doubble_sort {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names and their corresponding scores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            sc.nextLine(); // Consume the newline character
        }

        // Bubble sort algorithm to sort names and scores in descending order based on scores
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores[j] and scores[j + 1]
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        
        System.out.println("\tSorted names and scores in descending order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}
