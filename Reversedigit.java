import java.util.*;
public class Reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remainder;
        int reverse = 0;
        System.out.println("Enter the number");
        int n = sc.nextInt();
       while (n > 0) {
        remainder = n % 10;
        reverse = reverse * 10 + remainder;
        n /= 10;
       }
       System.out.println("remanider = "+reverse);
        sc.close();
    }
}
