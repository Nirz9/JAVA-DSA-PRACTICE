public class Sumofarray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int Sum = 0;
        int Count = 0;
        for (int i = 0; i < array.length; i++) {
            Sum += array[i];
            Count++;
        }
        System.out.println("The sum of arrays = "+Sum);
        System.out.println("The average of arrays = "+Sum / Count);
    }
}
