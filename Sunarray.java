public class Sunarray {
    public static void main(String[] args) {
        int sum = 0;
        int maxsum = 0;
        int k = 3;
        int array[] = { 100, 200, 300, 400 };
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        maxsum = sum;

        for (int i = k; i < array.length; i++) {
            sum += array[i] - array[i - k];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);

    }
}
