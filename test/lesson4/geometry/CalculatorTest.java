package lesson4.geometry;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    Calculator figures = new Calculator();
    private static final double DELTA = 1e-15;


    @Test (timeout = 3000)
    public void testCalculateAreaOfTriangle() throws Exception {
        figures.setHeightFirst(3);
        figures.setHeightTwo(4);
        figures.setHeightThree(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        Assert.assertEquals(31415.926535897932, figures.calculateAreaOfCircle(), DELTA);
    }

    @Test (timeout = 3000)
    public void testCalculateAreaOfRectangle() throws Exception {
        figures.setHeightFirst(3);
        figures.setHeightTwo(4);
        figures.setHeightThree(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        Assert.assertEquals(300.0, figures.calculateAreaOfRectangle(), DELTA);
    }

    @Test (timeout = 3000)
    public void testCalculateAreaOfCircle() throws Exception {
        figures.setHeightFirst(3);
        figures.setHeightTwo(4);
        figures.setHeightThree(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        Assert.assertEquals(6.0, figures.calculateAreaOfTriangle(), DELTA);
    }
}