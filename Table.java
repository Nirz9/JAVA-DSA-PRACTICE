import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
        sc.close();
    }
}
