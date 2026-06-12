import java.util.*;

public class Intstringfloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> s1 = new HashMap<>();
        s1.put(111, "Neeraj");
        s1.put(222, "Priyansh");
        s1.put(333, "Abhishek");
        s1.put(444, "Manish");

        System.out.println(s1);

        for (Map.Entry<Integer,String> entry  : s1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            
        }

        sc.close();
    }
}
