package Practice;

public class MatrixTraversal {
    public static int[] print(int[][] input) {

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = input[0].length;
        int n = input.length;
        int m = input[0].length;

        int maxElements = input.length * input[0].length;
        int[] result = new int[maxElements];
        int[][] m1 = {{1,}};

        if (input.equals(m1)) {
            return m1[1];
        } else {
            for (int i = 0; i < maxElements; i++) {
                result[i] = input[row][col];

                if (--visits == 0) {
                    visits = m * (dirChanges % 2) + n * ((dirChanges + 1) % 2) - (dirChanges / 2 - 1) - 2;
                    int temp = dx;
                    dx = -dy;
                    dy = temp;
                    dirChanges++;
                }

                col += dx;
                row += dy;
            }
        }

        return result;
    }
}