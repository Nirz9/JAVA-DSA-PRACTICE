import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.printf("A is Largest ", a);

        } else if (b > c && b > a) {
            System.out.printf("B is Largest ", b);

        } else if (c > a && c > b) {
            System.out.printf("C is Largest ", c);

        } else if (a == b && b == c && a == c) {
            System.out.printf("How many number are Largest", a, b, c);

        } else {
            System.out.println("invalid");
        }
        sc.close();
    }
}
