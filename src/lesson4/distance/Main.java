package lesson4.distance;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {
        double x1 = 10;
        double x2 = 20;
        double y1 = 30;
        double y2 = 35;

        System.out.println("Distance between two point equals: " + Distance.distance(x1, y1, x2, y2));
    }
}
