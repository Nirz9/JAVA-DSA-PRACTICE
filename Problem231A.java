import java.util.*;

public class Problem231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("enter the majority of persion");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("enter first majority number if yes you can enter 1 number");
            int p = sc.nextInt();
            System.out.println("enter first majority number if yes you can enter 2 number");
            int v = sc.nextInt();
            System.out.println("enter first majority number if yes you can enter 3 number");
            int t = sc.nextInt();
            int sum = p + v + t;
            if (sum >= 2) {
                count++;

            }
            n--;
        }

        System.out.println(count);
        sc.close();

    }
}