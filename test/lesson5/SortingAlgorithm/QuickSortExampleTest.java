package lesson5.SortingAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortExampleTest {
    int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

    @Test(timeout = 3000)
    public void testPrintArray() throws Exception {

        Assert.assertEquals("5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0", QuickSortExample.printArray(list));
    }

    @Test(timeout = 3000)
    public void testStartSort() throws Exception {
        QuickSortExample.startSort(list);

        Assert.assertEquals("-9, -7, 0, 1, 2, 2, 5, 5, 6, 7, 8", QuickSortExample.printArray(list));
    }
}