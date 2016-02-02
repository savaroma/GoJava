package lesson4.distance;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
    private static final double DELTA = 1e-15;

    @Test (timeout = 3000)
    public void testCalculateDistance() throws Exception {
        double x1 = 10.0;
        double x2 = 20.0;
        double y1 = 30.0;
        double y2 = 35.0;

        Assert.assertEquals(11.180339887498949, Distance.calculateDistance(x1, y1, x2, y2), DELTA);

    }
}