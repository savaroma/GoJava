package lesson5.SortingAlgorithm;

import java.util.Arrays; //неиспользуемые импорты за борт. Где-то в идее есть настройки, чтобы сама подчищала неиспользуемые импорты
import java.util.Random;

public class QuickSortExample {
    public static int ARRAY_LENGTH = 30; //все задаваемые данные лучше выносить в мейн, передавать в этот класс параметром.
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();//можно не создавать инстанс, а вызывать статические методы этого класса на месте.

    public static void initArray() {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static String printArray() {
        String result = "";

        for (int i = 0; i < ARRAY_LENGTH - 1; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[ARRAY_LENGTH-1];
        return result;
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }

            }
            doSort(start, cur);
            doSort(cur + 1, end);

        }
    }

}

