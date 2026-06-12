import java.util.*;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 7, 1, 5, 3, 6, 4 };
        int max = 0;

        System.out.print("Enter day: ");
        int index = sc.nextInt();

        System.out.println("The price on current day = " + array[index]);
        for (int i = index; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                // break;

            }
        }
        System.out.println("max = " + max);
        int profit;
        profit = max - array[index];
        System.out.println("profit = " + profit);
        sc.close();
    }
}


// for (int i = 0; i < array.length; i++) {
// if (array[i] > max) {
// max = array[i];

// }

// }
// System.out.println("Max = " + max);
// for (int j = 0; j < array.length; j++) {
// if (array[j] < max) {
// max = array[j];

// }
// }
// System.out.println("Min = " + max);

// }
// }
