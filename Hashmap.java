
//import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("china", 150);
        map.put("America", 100);
        map.put("Russia", 80);

        System.out.println(map);

        if (map.containsKey("India")) {
            System.out.println("This key is present in the map  = " + map.containsKey("India"));
        } else {
            System.out.println("This key does not present in the map");
        }

        System.out.println(map.get("India"));

        System.out.println(map.get("Spain"));

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());

        }
    }
}
