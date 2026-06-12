import java.util.*;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("Even = ", i);
            } else if (i % 2 != 0) {
                System.out.printf("Odd = ", i);
            } else {
                System.out.println("invalid");
            }
            System.out.println(i);
        }

        sc.close();
    }
}