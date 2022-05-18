package colletions.collection;

import java.util.LinkedList;
import java.util.List;

public class ListPerformanceUtil {

    public static void removeFirst(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.removeFirst();
            }
        } else {
            for (int i = 0; i < 10000; i++) {
                list.remove(0);
            }
        }

        end = System.nanoTime();

        System.out.printf("removeFirst of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void removeMiddle(List<?> list) {
        if (list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            list.remove(i);
        }


        end = System.nanoTime();

        System.out.printf("removeMiddle of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

        public static void removeLast(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.removeLast();
            }
        } else {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
        }


        end = System.nanoTime();

        System.out.printf("removeLast of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void getFirst(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.getFirst();

            }
        } else {

            for (int i = 0; i < 10000; i++) {
                list.get(0);
            }

        }

        end = System.nanoTime();

        System.out.printf("getFirst of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }
    public static void getMiddle(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list.get(500);
        }

        end = System.nanoTime();

        System.out.printf("getMiddleElement of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void getLast(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.getLast();

            }
        } else {

            int size = list.size();
            for (int i = 0; i < 10000; i++) {
                list.get(size - 1);
            }

        }

        end = System.nanoTime();

        System.out.printf("getLast of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void addToFirst(List<?> list) {

        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.addFirst(null);
            }
        } else {

            for (int i = 0; i < 10000; i++) {
                list.add(0, null);
            }
        }
        end = System.nanoTime();

        System.out.printf("addToFirst of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void addToLast(List<?> list) {
        long start;
        long end;
        start = System.nanoTime();

        if (isLinkedList(list)) {
            LinkedList<?> linkedList = (LinkedList<?>) list;
            for (int i = 0; i < 10000; i++) {
                linkedList.addLast(null);
            }
        } else {

            int size = list.size();
            for (int i = 0; i < 10000; i++) {
                list.add(null);
            }
        }

        end = System.nanoTime();

        System.out.printf("addToLast of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    public static void addToMiddle(List<?> list) {
        if(list.isEmpty())
            addToLast(list);

        long start;
        long end;
        start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list.add(5000, null);
        }
        end = System.nanoTime();

        System.out.printf("addToMiddle of %s :  %d ns %c", list.getClass(), end - start, '\n');
    }

    private static boolean isLinkedList(List<?> list) {
        return list.getClass().getName().equals("java.util.LinkedList");
    }

}