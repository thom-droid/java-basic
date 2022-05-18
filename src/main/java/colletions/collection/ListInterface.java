package colletions.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListPerformanceUtil.addToFirst(linkedList);
        ListPerformanceUtil.addToFirst(arrayList);
        ListPerformanceUtil.addToLast(linkedList);
        ListPerformanceUtil.addToLast(arrayList);
        ListPerformanceUtil.addToMiddle(linkedList);
        ListPerformanceUtil.addToMiddle(arrayList);
        ListPerformanceUtil.getFirst(linkedList);
        ListPerformanceUtil.getFirst(arrayList);
        ListPerformanceUtil.getMiddle(linkedList);
        ListPerformanceUtil.getMiddle(arrayList);
        ListPerformanceUtil.getLast(linkedList);
        ListPerformanceUtil.getLast(arrayList);
        ListPerformanceUtil.removeFirst(linkedList);
        ListPerformanceUtil.removeFirst(arrayList);
        ListPerformanceUtil.removeMiddle(linkedList);
        ListPerformanceUtil.removeMiddle(arrayList);
        ListPerformanceUtil.removeLast(linkedList);
        ListPerformanceUtil.removeLast(arrayList);

    }
}
