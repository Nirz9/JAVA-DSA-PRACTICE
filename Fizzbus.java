import java.util.*;

public class Fizzbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf(" " + i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.printf("Fizz ");
            } else if (i % 5 == 0) {
                System.out.printf("buzz ");
            }
        }

        sc.close();
    }
}
