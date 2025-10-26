public class Prime {
    int num;

    Prime() {
        num = 0;
    }

    void input(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        sc.close();
    }

    void cal(){
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.input();
        obj.cal();
    }
}
