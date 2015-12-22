package lesson4.distance;

import static java.lang.Math.*;

public class Distance {
    public static double calculationDistance(double x1, double y1, double x2, double y2) {//calculateDistance будет лучше
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
