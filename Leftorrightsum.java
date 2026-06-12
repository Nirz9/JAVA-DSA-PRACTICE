public class Leftorrightsum {
    public static void main(String[] args) {
        int[] array = { 1, 7, 3, 6, 5, 6 };
        int leftsum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int value;
        for (int j = 0; j < array.length; j++) {
            value = sum - array[j];
        }
        System.out.println("Sum = "+sum);
        if (leftsum == sum) {
            System.out.println("not equal");
            
        }
        else if (array[i] == sum) {
            
        }

    }
}
