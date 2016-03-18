package Practice;

public class AverageNumber {
    public static int average(int a, int b) {

        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (a == Integer.MIN_VALUE && b < 0 || b == Integer.MIN_VALUE && a < 0) {
            return (a / 2 + b / 2);
        }
        if (a < 0 && b < 0) {
            return (a + b) / 2;
        }
        return Math.abs((a + b) >>> 1);
    }
}
