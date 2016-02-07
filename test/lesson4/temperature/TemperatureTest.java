package lesson4.temperature;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*; //мертвый код

public class TemperatureTest {
    private static final double DELTA = 1e-15;

    @Test (timeout = 3000)
    public void testToFahrenheit() throws Exception {
        double celsius = 36.6;

        Assert.assertEquals(97.88000000000001, Temperature.toFahrenheit(celsius), DELTA);

    }

    @Test (timeout = 3000)
    public void testToCelsius() throws Exception {
        double fahrenheit = 100;

        Assert.assertEquals(37.77777777777778, Temperature.toCelsius(fahrenheit), DELTA);

    }
}