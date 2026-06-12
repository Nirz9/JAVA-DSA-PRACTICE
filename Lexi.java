public class Lexi {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        for (int i = 0; i < str1.length(); i++) {
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(i);
            if (s1 == s2) {
                System.out.println("Characters at index " + i + " are the same: '" + s1 + "'");
                continue;
            }
           else if (s1 < s2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
                break;
            } else if (s1 > s2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
                break;
            }
        }
    }
}
