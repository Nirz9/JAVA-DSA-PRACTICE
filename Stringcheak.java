import java.util.*;

public class Stringcheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = sc.next();
        for (int i = 0; i < str1.length(); i++) {
            char s1 = str1.charAt(i);
            if (s1 == 'h' || s1 == 'q') {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
            break;

        }
        sc.close();

    }

}