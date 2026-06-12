public class palindrome {
    public static void main(String[] args) {
      //  StringBuilder sb = new StringBuilder();
        String str = "racecar";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The given string is palindrome = "+rev);
        } else {
            System.out.println("The given string is not palindrome ="+rev);
        }
    }
}