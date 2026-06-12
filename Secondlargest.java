public class Secondlargest {
    public static void main(String[] args) {
        int array[] = { 10, 45, 23, 54, 98, 9 };
        int temp;
        int largest = -1;
        int max = -1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = largest;
                largest = array[i];

            } else if (array[i] > largest && array[i] != largest) {
                largest = array[i];
            }

        }
        System.out.println("The max value in array = " + largest);

    }
}
