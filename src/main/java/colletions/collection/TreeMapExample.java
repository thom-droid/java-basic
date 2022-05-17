package colletions.collection;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("젤다", 1);
        treeMap.put("링크", 2);
        treeMap.put("가논", 5);
        treeMap.put("고론", 10);
        treeMap.forEach((s, integer) -> System.out.println(s + integer));
    }
}
