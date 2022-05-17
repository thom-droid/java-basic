package colletions.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        String a = "쀡겠츢";
        String b = "파이리";
        String c = "가나다";
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);

        for (String s : treeSet) {
            System.out.println(s);
        }
        String least = treeSet.first();
        System.out.println(least);
        treeSet.clear();

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(23);
        treeSet1.add(32);
        treeSet1.add(9);
        treeSet1.add(10);
        treeSet1.add(18);
        for (Integer integer : treeSet1) {
            System.out.println(integer);

        }




    }
}
