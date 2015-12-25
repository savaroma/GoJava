package lesson5.SortingAlgorithm;

public class SortMain {
    public static void main(String[] args) {
    int[] array = new int[30];
        QuickSortExample.initArray(array);
        System.out.println(QuickSortExample.printArray(array));
        QuickSortExample.quickSort(array, 0, array.length-1);
        System.out.println(QuickSortExample.printArray(array));
    }
}
