import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rem;
        int count = 0;
        int Sum = 0;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while (n > 0) {
            Rem = n % 10;
            n /= 10;
            count++;
            Sum +=Rem;
        }
        System.out.println("" + count);
        System.out.println("" + Sum);
        sc.close();
    }
}
