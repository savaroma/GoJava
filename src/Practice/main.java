package Practice;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        char[] ch = {'1', '2', '2'};
        //    System.out.println(JoinCharacters.join(ch));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9,}};
        int[][] test1 = {{1, 2, 3,}};
        int[][] m1 = {{1,}};
        int[] arr = {1, 1, 1, 8, 1, 1,};
        //     System.out.println(lonelyNumber.find(arr));
        //   System.out.println(MatrixTraversal.print(matrix));
        //System.out.println(MatrixSnakeTraversal.print(test1));
//        String a = "101";
//        String b = "100";
//        System.out.println(AddBinary.add(a, b));
//        String str = "abd₴cba";
        //      System.out.println(FirstUniqueCharacter.find(str));
//        System.out.println(BitsPalindrome.isPalindrome(-2147483647));
//        System.out.println(BitsPalindrome.isPalindrome(1));
//        System.out.println(AverageNumber.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        System.out.println(UnixPath.simplify("/var/lib/../log/./../tmp/data///.!"));
//        System.out.println(UnixPath.simplify("/var//lib"));
//        System.out.println(UnixPath.simplify("/home/../var/./lib//file.txt"));
//        System.out.println(UnixPath.simplify("/."));
//        System.out.println(UnixPath.simplify("//"));


        int[] gnomes = new int[]{5, 7, 6, 9, 4};
        int[] food = new int[]{8,5,6,2,3};
        System.out.println(Arrays.toString(new GnomeFood().find(gnomes, food)));

    }
}
