import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] visited = new int[arr.length];

        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int count3 = 0;

            for (int l = 0; l < count2 + 1; l++) {

                if (arr[i] != visited[l]) {
                    count3++;
                }
            }

            if (count3 == count2 + 1) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
                visited[count2] = arr[i];
                count2++;
            }

        }
    }
}
