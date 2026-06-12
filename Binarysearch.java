public class Binarysearch {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 9;
        int left = 0;
       // int mid = 0;
        int count = 0;
        int right = array.length - 1;
        while (left <= right) {
           int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                count = mid;
                break;
            }

            else if (array[mid] < key) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }
        System.out.println(count);
    }
}
