import java.util.*;

public class KeywordAddusing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        str.add("Narottam");
        str.add("Abhishek");
        str.add("Priyansh");
        System.out.println(str);

        str.add(0, "Manish");
        System.out.println(str);

        str.set(0, "Manish");
        System.out.println(str);

        System.err.println("The 2nd index value is = "+str.get(2));

        Collections.sort(str);
        System.out.println(str);

        sc.close();
    }
}
