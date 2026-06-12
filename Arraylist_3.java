import java.util.*;


public class Arraylist_3 {
    public static void main(String[] args) {
        List<String> codingLanguage = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        codingLanguage.add("java");
        codingLanguage.add("Python");
        codingLanguage.add("c++");
        codingLanguage.add("javascript");

        codingLanguage.add(1, "Rust");
        codingLanguage.add(2, "Go");

        System.out.println(codingLanguage);
        System.out.println("The value of 2 index is = " + codingLanguage.get(2));

        codingLanguage.set(2, "Anaconda");

        System.out.println(codingLanguage);

        codingLanguage.remove(3);
        
        System.out.println(codingLanguage);

        Collections.sort(codingLanguage);
        System.out.println(codingLanguage);

        sc.close();

    }
}
