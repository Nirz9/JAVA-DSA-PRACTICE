import java.util.ArrayList;
import java.util.Arrays;

public class Printarray {
    public static void main(String[] args) {
        int array[] = {1,3,2,4,5,6,3,2,3,4,5};
        // ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,89,523,836));
        // arrayList.add(777);
        // arrayList.add(0, 121);
        
        // System.out.println(arrayList);
        // System.out.println(arrayList.getFirst());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            arrayList.add(integer);
        }
        System.out.println(arrayList);
    }
}
