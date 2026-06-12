import java.util.*;

public class Sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The sum of natural number is " + n * (n + 1) / 2);
        sc.close();
    }
}
