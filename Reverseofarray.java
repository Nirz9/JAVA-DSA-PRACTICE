public class Reverseofarray {
    public static void main(String[] args) {
        
        System.out.println("sequence Arrays");

        int[] array = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < array.length; i++) {
            System.out.printf(" " + array[i]);
        }
        System.out.println(" ");
        System.out.println("Reverse Arrays");

        for (int j = array.length - 1; j >= 0; j--) {

            System.out.printf(" " + array[j]);

        }

    }
}
