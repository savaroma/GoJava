package lesson5.MaxMinSearch;

public class SearchMain {
    public static void main(String[] args) {
        SearchMinMax search = new SearchMinMax();
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
        System.out.println("Min is: " + search.searchMin(list));
        System.out.println("Max is: " + search.searchMax(list));
    }
}
