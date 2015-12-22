package lesson4.distance;

public class DistanceMain {
    public static void main(String[] args) {
        double x1 = 10.0;
        double x2 = 20.0;
        double y1 = 30.0;
        double y2 = 35.0;

        System.out.println("Distance between two point equals: " + Distance.calculateDistance(x1, y1, x2, y2));
    }
}
