import java.util.Scanner;

public class Sum {
    int a, b, sum;

    Sum() {
        a = 0;
        b = 0;
        sum = 0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
    }

    void cal(){
        sum = a + b;
    }

    void display(){
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.input();
        obj.cal();
        obj.display();
    }
}
