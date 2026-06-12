import java.util.ArrayList;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.*;

public class Arraylist_2 {
    public static void main(String[] args) {
        List<String> codingLanguage = new ArrayList<>();
         Scanner sc = new Scanner(System.in);

        int[] array = { 1, 54, 63, 54, 87, 43, 42 };

         for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
        }

        System.out.println("the number");
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("Soretd array");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

         codingLanguage.add("1");
         codingLanguage.add("2");
         codingLanguage.add("3");
         codingLanguage.add("4");
         codingLanguage.add("5");
         codingLanguage.add("6");
         

          System.out.println(codingLanguage);

         for (String string : codingLanguage) {
             System.out.println(codingLanguage);
         }
         sc.close();

    }
}
