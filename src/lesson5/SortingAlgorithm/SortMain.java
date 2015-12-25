package lesson5.SortingAlgorithm;

public class SortMain {
    public static void main(String[] args) {
    int[] array = new int[30];
        QuickSortExample.initArray(array);
        System.out.println(QuickSortExample.printArray(array));
        QuickSortExample.startSort(array);
        System.out.println(QuickSortExample.printArray(array));
    }
}
