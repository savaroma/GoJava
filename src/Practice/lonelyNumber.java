package Practice;

import java.util.Arrays;

public class lonelyNumber {
    public static int find(int[] input) {

        int result = 0;

        Arrays.sort(input);
        if (input[0] != input[1]) {
            return input[0];
        }

        if (input[input.length - 1] != input[input.length - 2]) {
            return input[input.length - 1];
        } else {

            for (int i = 5; i < input.length - 1; i += 5) {
                if (input[i] != input[i + 1]) {
                    result = input[i];
                }

            }
        }
        return result;
    }
}