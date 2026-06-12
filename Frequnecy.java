// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// //import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// //import java.util.Set;

public class Frequnecy {
    public static void main(String[] args) {
        int array[] = { 2, 3, 1, 4, 5, 2, 3 };
        // HashSet<Integer> set = new HashSet<>();
        // set.add(2);
        // set.add(3);
        // set.add(3);
        // set.add(2);
        // set.add(5);
        // set.add(1);
        // set.add(4);
        // System.out.println(set);
        // int array[] = { 1, 2, 3, 4, 2, 5, 3 };
        // int temp = 0;
        // for (int i = 0; i < array.length; i++) {
        // for (int j = 0; j < array.length; j++) {
        // if (array[j] > array[i]) {
        // temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;

        // }

        // }
        // }
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }

        // int count = 0;

        // for (int i = 0; i < array.length; i++) {
        // for (int j = 1; j < array.length; j++) {
        // if (array[i] == array[j]) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        // List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 4, 5, 3));
        // Map<Integer, Integer> freqMap = new HashMap<>();
        // for (Integer i : list1) {
        // if (freqMap.containsKey(i) == true) {
        // int freqOfkey = freqMap.get(i);
        // freqMap.put(i, freqOfkey + 1);
        // } else {
        // freqMap.put(i, 1);
        // }

        // }
        // System.out.println(freqMap);

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1;

                }

            }
            if (array[i] != -1) {
                System.out.println(array[i] + "=" + count);

            }

        }

    }
}
