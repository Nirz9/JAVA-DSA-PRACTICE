//import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Reverse {
    public static void main(String[] args) {
        int array[] = { 12, 43, 32, 86, 90, 21, 11, 34, 54, 11, 22, 22, 11, 21, 90 };
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorted = ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(" , " + array[i]);
        }
        System.out.println();
        System.out.print("Reverse =");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" , " + array[i]);

        }
        System.out.println();

        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max= " + max);

        int Secondlargest = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > Secondlargest) {
                Secondlargest = array[i];

            }

        }
        System.out.println("Second largest = " + Secondlargest);

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1;

                }

            }
            if (array[i] != -1) {
                System.out.println(array[i] + " has " + count + " Frequency value");

            }

        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int sum1 = 0;

        int array1[] = { 21, 32, 32, 11, 22, 45, 65, 1, 2, 3 };

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        System.out.println("Sum of Two Array = " + (sum + sum1));

        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer x : array1) {
            map.put(x, map.getOrDefault(x,0)+1);
        }

          for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }
        

    }
}
