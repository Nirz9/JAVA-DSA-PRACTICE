import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 2 };
        int num1 = 0;
        Arrays.sort(num);
        // int[] array = { 1, 2, 3, 4 ,1};
        int num11 = 0;
        for (int i = 0; i < num.length - 1; i++) {

            if (num[i] == num[i + 1]) {

                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
