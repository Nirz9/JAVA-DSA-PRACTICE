import java.util.ArrayList;
import java.util.List;

public class Findduplicate {
    public static void main(String[] args) {
        List<Integer> codingLanguage = new ArrayList<>();
        int array[] = { 1, 2, 3, 2, 3, 1, 5, 6 };
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1]) {
                codingLanguage.add(array[i]);
            }
        }
        System.out.println(codingLanguage);

    }
}
