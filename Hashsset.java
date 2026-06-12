import java.util.HashSet;
import java.util.Iterator;

public class Hashsset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(111);
        set.add(222);
        set.add(333);
        set.add(444);
        set.add(555);
        set.add(111);
        System.out.println(set);
        System.out.println("The size of set is = " + set.size());
        
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }

        if (set.contains(111)) {
            System.out.println("This value is present in set = " + set.contains(111));
        }
        if (set.contains(666)) {
            System.out.println("This value is not present in set = " + set.contains(666));

        }
        
    }
}
