import java.util.*;

public class Redgreenblue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
       // int n = sc.nextInt();
       // System.out.println("Enter the red");
        int r = sc.nextInt();
       // System.out.println("Enter the green");
        int g = sc.nextInt();
        
        // System.out.println("Enter the blue");
        int b = sc.nextInt();
        int sum = r + g + b;
        int value;

        if (r > b && r > g) {
          //  System.out.println(" " + r);
            max = r;

        } else if (g > r && g > b) {
            // System.out.println(" " + g);
            max = g;

        } else if (b > r && b > g) {
            // System.out.println(" " + b);
            max = b;

        } else if (r == g && g == b && b == r) {

            // System.out.println(" " + r + g + b);
        }
      //  System.out.println("max = " + max);

        value = sum - max;
       // System.out.println("Value = " + value);
        int empty = max - 1;
        if (value >= empty) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
