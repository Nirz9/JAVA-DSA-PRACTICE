import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
       
        if (marks == 100) {
            System.out.printf("A Grade ");

        } else if (marks <= 99 && marks > 90 ) {
            System.out.printf("B Grade");

        } else if (marks <= 89 && marks > 80) {
            System.out.printf("C Grade ");

        } else if (marks <= 79 && marks > 70) {
            System.out.printf("D Grade");

        } else {
            System.out.println("fail");
        }
        sc.close();
    }
}
