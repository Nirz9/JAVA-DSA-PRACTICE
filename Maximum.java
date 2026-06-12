public class Maximum {
    public static void main(String[] args) {
        int[] array = { 10, 30, 55, 34, 50, 89 };
        int Max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
        }
        System.out.println("The Maximum value of array = " + Max);
        for (int j = 0; j < array.length; j++) {
            if (array[j] < Max) {
                Max = array[j];
            }

        }
        System.out.println("The Minimum value of array = " + Max);

    }
}
