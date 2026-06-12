// Easy Level
// Create an ArrayList<Integer> and add numbers 10, 20, 30, 40, 50.
// Print all elements.
// Find the size of an ArrayList.
// Print the first and last element of an ArrayList.
// Add an element at index 2.
// Remove an element from index 3.
// Check whether 25 exists in the ArrayList or not.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// import javax.swing.LayoutFocusTraversalPolicy;
// import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.getFirst() + "," + al.getLast());
        al.add(2, 2);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        System.out.println(al.contains(25));

        System.out.println(al2);
        int max = 0;

        for (Integer integer : al2) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("Max = " + max);

        for (Integer integer : al2) {
            if (integer < max) {
                max = integer;
            }
        }
        System.out.println("Mini = " + max);

        int sum = 0;
        for (Integer integer : al2) {
            sum = integer + sum;

        }
        System.out.println("Sum = " + sum);
        int count = 0;

        for (Integer integer : al2) {
            if (integer % 2 == 0) {
                count++;

            }

        }
        System.out.println(count);
        System.out.println(al2);

        for (int i = al2.size() - 1; i >= 0; i--) {

            System.out.println("Reverse = " + al2.get(i));
        }

        Collections.sort(al2);
        System.out.println("Soretd = " + al2);
        Collections.reverse(al2);
        System.out.println("Reverse = " + al2);
        al2.add(0, 1);
        al2.add(6, 2);
        al2.add(4, 3);
        al2.add(7, 2);
        System.out.println(al2);
        List<Integer> dulpList = al2.stream().distinct().toList();
        System.out.println(dulpList);

        Integer array[] = { 1, 2, 2, 1, 4, 5, 1, 3, 8, 4, 6 };
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);
        ArrayList<Integer> set = new ArrayList<>(hashSet);

        Collections.rotate(set, 2);
        System.out.println(set);

    }
}
