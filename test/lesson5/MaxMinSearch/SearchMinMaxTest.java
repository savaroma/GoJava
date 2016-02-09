package lesson5.MaxMinSearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchMinMaxTest {
    SearchMinMax search = new SearchMinMax();
    int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

    @Test(timeout = 3000)
    public void testSearchMin() throws Exception {

        Assert.assertEquals(-9, search.searchMin(list));
    }

    @Test(timeout = 3000)
    public void testSearchMax() throws Exception {

        Assert.assertEquals(8, search.searchMax(list));
    }
}