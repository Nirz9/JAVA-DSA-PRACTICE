public class Evenoroddinarray {
    public static void main(String[] args) {
        int[] array = { 11, 2, 45, 76, 98, 45, 22, 45, 84, 28, 65 };
        int count = 0;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            } else if (array[i] % 2 != 0) {
                value++;
            }
        }
        System.out.println("The even number present in array = " + count);
        System.out.println("The odd number present in array = " + value);
    }

}
