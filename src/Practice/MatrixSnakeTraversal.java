package Practice;

public class MatrixSnakeTraversal {
    public static int[] print(int[][] input) {

        int row = 0;
        final int rows = input[0].length;
        final int cols = input.length;
        final int size = rows * cols;
        int[] result = new int[rows * cols];
        int counter = 0;

        while (counter < size ) {
            if (row % 2 == 0 && counter < size) {
                for (int i = 0; i < cols; i++) {
                    result[counter] = input[i][row];
                    counter++;
                }
                row++;

            }

            if (row % 2 == 1 && counter < size) {
                for (int j = cols - 1; j >= 0; j--) {
                    result[counter] = input[j][row];
                    counter++;
                }
                row++;
            }
        }
        return result;
    }
}