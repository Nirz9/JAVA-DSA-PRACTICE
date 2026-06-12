//import java.text.ListFormat;
import java.util.*;

public class Containsall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> cd1 = new ArrayList<>();
        List<Integer> cd2 = new ArrayList<>();

        cd1.add(1);
        cd1.add(2);
        cd1.add(3);
        cd1.add(4);
        cd1.add(5);
        cd1.add(6);
        cd2.add(1);
        cd2.add(2);
        cd2.add(3);
        cd2.add(4);
        cd2.add(5);
        System.out.println("The contain all elements = " + cd1.containsAll(cd2));
        System.out.println("The intersection of list 1 and list 2 is = " + cd2.containsAll(cd1));

        System.out.println("The contain all elements = " + cd1.retainAll(cd2));
        System.out.println("The intersection of list 1 and list 2 is = " + cd2.removeAll(cd1));

        sc.close();

    }
}
