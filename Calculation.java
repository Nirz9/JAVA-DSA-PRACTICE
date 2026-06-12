import java.util.*;

interface Calculate {

    int operate(int a, int b);
}

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate addition = (a, b) -> (a + b);
        Calculate substracion = (a, b) -> (a - b);
        Calculate Multiplication = (a, b) -> (a * b);
        Calculate devison = (a, b) -> {

            try {
                return a / b;
            } catch (Exception e) {
                System.out.println(e);
                return 0;
            }
        };
        Calculate modules = (a, b) -> (a % b);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Additon = "+addition.operate(a, b));
        System.out.println("Subsctracion = "+substracion.operate(a, b));
        System.out.println("Multiplication = "+Multiplication.operate(a, b));
        System.out.println("Devision = "+devison.operate(a, b));

        System.out.println("Remanider = "+modules.operate(a, b));

        // System.out.println("the addition of two number = " + addition.operate(12,
        // 6));
        // System.out.println("the substaction of two number = " +
        // substracion.operate(12, 32));
        // System.out.println("the mltiple of two number = " +
        // Multiplication.operate(12, 62));
        // System.out.println("the division of two number = " + devison.operate(12, 3));
        // System.out.println("the modules of two number = " + modules.operate(12, 5));
        sc.close();

    }
}
