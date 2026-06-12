public class Maximum {
    public static void main(String[] args) {
        int array[] = {12,32,53,12,43,1,98,3};
        int max =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("the max value is "+max);

    }
}
