package Enterprise.module1;

class Print {
    public static void print(long[] arrayList, long[] linkedList, long[] treeSet,  long[] hashSet) {
        System.out.println("-------------------------------------------------------------------------------------------------");

        Print.printHead();
        System.out.println("-------------------------------------------------------------------------------------------------");

        Print.printArrayList("ArrayList", arrayList);
        Print.printLinkedList("LinkedList", linkedList);
        Print.printSet("TreeSet", treeSet);
        Print.printSet("HashSet", hashSet);
        System.out.println("-------------------------------------------------------------------------------------------------");

    }

    public static void printHead() {
        System.out.println("|\t\t\t\t" + "add" + "\t\t" + "get" + "\t\t\t" + "remove" + "\t\t" +
                "contains" + "\t" + "populate" + "\t" + "iter.add" + "\t" + "iter.remove" + " |");
    }

    public static void printArrayList(String name, long[] result) {
        System.out.print("| " + name + ":\t" + result[0] / 1000 + "\t\t" + result[1] / 1000 + "\t\t\t"
                + result[2] / 1000 + "\t\t\t" + result[3] / 1000 + "\t\t\t" + result[4] / 1000 + "\t\t\t"
                + result[5] / 1000 + "\t\t\t" + result[6] / 1000 + "\t\t\t|");
        System.out.println();
    }
    public static void printLinkedList(String name, long[] result) {
        System.out.print("| " + name + ":\t" + result[0] / 1000 + "\t\t" + result[1] / 1000 + "\t\t\t"
                + result[2] / 1000 + "\t\t\t" + result[3] / 1000 + "\t\t\t" + result[4] / 1000 + "\t\t"
                + result[5] / 1000 + "\t\t" + result[6] / 1000 + "\t\t|");
        System.out.println();
    }

    public static void printSet(String name, long[] result) {
        System.out.print("| " +name + ":\t\t" + result[0] / 1000 + "\t\t\t\t\t" + result[1] / 1000 + "\t\t\t"
                + result[2] / 1000 + "\t\t\t" + result[3] / 1000 + "\t\t\t\t\t\t\t\t\t" + "|");
        System.out.println();
    }


}
