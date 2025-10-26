import java.util.Scanner;

public class Parameterise {
    int a, b, sum;

    Parameterise(int x, int y) {
        a = x;
        b = y;   // Variable = Parameter/Value passed
        sum = 0;
    }

    void cal(){
        sum = a + b;
    }

    void display(){
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sc.close();

        Parameterise obj = new Parameterise(num1, num2);
        obj.cal();
        obj.display();
    }
}
