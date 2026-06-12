public class Missingelement {
    public static void main(String[] args) {
        int array[] = {1,3,2,5};
        int sum = 0;
        int total = (5 * (5+1) / 2);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    //  int total =
    int mising = total - sum;
    System.out.println(mising);
    
    System.out.println(array.length + 1);
    }
}
