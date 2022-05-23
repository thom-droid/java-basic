package colletions.collection;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String str = "abcdeaaa";

        for (int i = 0; i < str.length(); i++) {
            int value = map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), ++value);
        }

        map.forEach((character, integer) -> System.out.println(character +" = "+ integer ));

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("1", 1);
        map1.put("2", 3);

        HashMap<String, Integer> map2 = new HashMap<>(map1);
        List<String> list = new LinkedList<>();



    }
}
