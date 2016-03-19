package codeWars;

import java.util.Arrays;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {  //n = 5
        int startIndex = (n*n-n)+1;  //startIndex = 21
        int[] array = new int[n];    // array[5]
        array[0] = startIndex;       // array[0] = 21
        int index = startIndex;
        int result = 0;
        if (n > 1) {
            for (int i = 1; i < n; i++) { // i = 1, i = 2, i = 3, i = 4
                index += 2;    //23, 25, 27, 29
                array[i] = index;          //array[1] = 23, array[2] = 25, array[3] = 27, array[4] = 29
            }
            for (int i = 0; i < array.length; i++) {
                result = result + array[i];
            }
        } else return 1;
        return result;

    }
}