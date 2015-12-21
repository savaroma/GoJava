package lesson4.temperature;

public class Main {
    public static void main(String[] args) {
        double celsius = 36.6;
        System.out.println("36.6 degrees of Celsius = " + Temperature.toFahrenheit(celsius) + " in Celsius");

        double fahrenheit = 100;
        System.out.println("100 degrees fo Fahrenheit = " + Temperature.toCelsius(fahrenheit) + " in Fahrenheit");
    }
}
