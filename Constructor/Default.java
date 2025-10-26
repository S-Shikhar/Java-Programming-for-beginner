package Constructor;

import java.util.Scanner;

public class Default {
    int a, b, sum;

    Default() {
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
        Default obj = new Default();
        obj.input();
        obj.cal();
        obj.display();
    }
}
