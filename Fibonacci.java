import java.util.*;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fibo, a = 0, b = 1;
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("Fibonacci series");
    if (n == 1) {
      System.out.println(" " + a);
    } else if (n == 2) {
      System.out.println(a + "\n" + b);
    }
    for (int i = 3; i < n; i++) {
      fibo = a + b;
      System.out.println(" " + fibo);
      a = b;
      b = fibo;
    }

    sc.close();
  }
}
