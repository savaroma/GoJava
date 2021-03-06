package lesson5.SortingAlgorithm;

import java.util.Random;

public class QuickSortExample {
    private static Random generator = new Random();

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static String printArray(int[] array) {
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            result = result + array[i] + ", ";
        }

        result = result + array[array.length - 1];
        return result;
    }

    public static void startSort(int[] array) {
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);
    }

    private static void quickSort(int[] array, int left, int right) {
        int index = doSort(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }

    }

    private static int doSort(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int tmp;
        int pivot = array[left - (left - right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }
}

