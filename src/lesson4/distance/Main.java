package lesson4.distance;

public class Main {
    public static void main(String[] args) {
        double x1 = 10d; // можно и с буквой d, но можно и 10.0
        double x2 = 20d;
        double y1 = 30d;
        double y2 = 35d;

        System.out.println("Distance between two point equals: " + Distance.calculationDistance(x1, y1, x2, y2));
    }
}
