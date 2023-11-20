package pij.day13.lab;

public class SimpleListDriver {

    private static void driveInteger(SimpleList<Integer> simpleList) {
        final int INSIDE = 8022;
        final int OUTSIDE = 42;

        printListInfo(simpleList);
        simpleList.add(0, 8021);
        simpleList.add(1, INSIDE);
        simpleList.add(0, 8020);
        simpleList.add(3, 8023);
        System.out.println(simpleList.get(2));
        printListInfo(simpleList);
        printElementInfo(simpleList, INSIDE);
        printElementInfo(simpleList, OUTSIDE);
        System.out.println(simpleList.set(3, OUTSIDE));
        printListInfo(simpleList);
        printElementInfo(simpleList, OUTSIDE);
        System.out.println(simpleList.remove(1));
        printListInfo(simpleList);
        simpleList.clear();
        printListInfo(simpleList);
        simpleList.add(0, 9030);
        printListInfo(simpleList);
    }

    private static <E> void printElementInfo(SimpleList<E> simpleList, E value) {
        System.out.println(simpleList + ".contains(" + value + "): " + simpleList.contains(value));
        System.out.println(simpleList + ".indexOf(" + value + "): " + simpleList.indexOf(value));
    }


    private static <E> void printListInfo(SimpleList<E> simpleList) {
        System.out.println(simpleList + ".isEmpty(): " + simpleList.isEmpty());
        System.out.println(simpleList + ".size(): " + simpleList.size());
    }


    private static void driveCopy(SimpleList<Integer> simpleList) {
        simpleList.add(0, 20);
        simpleList.add(1, 21);
        simpleList.add(2, 22);
        System.out.println(simpleList);
        SimpleLinkedList<Integer> copy = new SimpleLinkedList<>(simpleList);
        System.out.println(copy);
        simpleList.set(1, 31);
        copy.set(2, 32);
        System.out.println(simpleList);
        System.out.println(copy);

        SimpleList<Integer> copy2 = new SimpleLinkedList<>(copy);
        System.out.println(copy2);
    }

    public static void main(String[] args) {
        SimpleList<Integer> simpleList = new SimpleLinkedList<>();
        //driveInteger(simpleList);
        driveCopy(simpleList);
    }


}
