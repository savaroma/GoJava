package Practice;

import java.util.Arrays;

public class FirstUniqueCharacter {

    public static Character find(String s) {

        char[] chArr =  s.toCharArray();
        int temp = 0;
        char test = chArr[0];

        Arrays.sort(chArr);

        for(int i = 1; i < chArr.length; i++) {

            if (test != chArr[i] && test != chArr[i-2]){
                System.out.println(chArr[i]);
                return chArr[i];
            }
        }

        return null;
    }
}