package sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        Map<String, Set<String>> names = new HashMap<>();

        // Assuming names is populated with some data
        names.put("A", Set.of("Alice", "Alicia", "Anton", "Angela"));
        names.put("Al", Set.of("Alice", "Alicia"));
        names.put("An", Set.of("Anton", "Angela"));
        names.put("B", Set.of("Bob", "Bobby", "Barbara"));
        names.put("Ba", Set.of("Barbara"));
        names.put("Bo", Set.of("Bob", "Bobby"));

        // Search for names starting with "A"
        String searchPrefix = "Bo";
        Set<String> result = names.get(searchPrefix);
        if (result != null) {
            System.out.println("Names starting with '" + searchPrefix + "': " + result);
        } else {
            System.out.println("No names found starting with '" + searchPrefix + "'");
        }
    }
}

