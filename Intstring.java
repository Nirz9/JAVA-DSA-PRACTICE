import java.util.ArrayList;
import java.util.HashMap;
// import java.util.HashSet;
import java.util.List;
import java.util.Map;
// import java.util.Set;
// import java.sql.Array;
import java.util.*;

public class Intstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> student = new HashMap<>();
        student.put(24000, "Neeraj");
        student.put(24100, "Kamal");
        student.put(24067, "Priyansh");
        student.put(24058, "Narottam");

        System.out.println(student);

        student.put(24001, "Shivam");

        System.out.println(student);
        System.out.println("The value of 1 position is = " + student.get(24067));
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 1, 1, 1, 1, 5, 6, 2, 4, 4, 2, 3, 5, 6, 7, 8, 8, 1, 4, 5));
        Map<Integer, Integer> freqMap = new HashMap<>();

        //System.out.println(list1.containsAll(set2));

        for (Integer i : list1) {
            if (freqMap.containsKey(i) == true) {
                int freqOfkey = freqMap.get(i);
                freqMap.put(i, freqOfkey + 1);
            } else {
                freqMap.put(i, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());

        }

        sc.close();

    }
}
