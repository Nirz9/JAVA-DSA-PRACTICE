public class Movezero {
    public static void main(String[] args) {
        int array[] = { 1, 0, 0, 12, 3 };
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
            System.out.println(array[i]);
        }
        
    }
    
}
