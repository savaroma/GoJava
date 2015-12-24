package lesson5.SortingAlgorithm;

public class SortMain {
    public static void main(String[] args) {
        QuickSortExample.initArray();
        System.out.println(QuickSortExample.printArray());
        QuickSortExample.quickSort();
        System.out.println(QuickSortExample.printArray());
    }
}
