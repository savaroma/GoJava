package lesson4.geometry;

import static java.lang.Math.*;

public class Calculate {
    private int katetFirst, katetTwo, gipotenuza, rectA, rectB;
    private double radius;

    public void setKatetFirst(int katetFirst) {
        this.katetFirst = katetFirst;
    }

    public void setKatetTwo(int katetTwo) {
        this.katetTwo = katetTwo;
    }

    public void setGipotenuza(int gipotenuza) {
        this.gipotenuza = gipotenuza;
    }

    public void setRectA(int rectA) {
        this.rectA = rectA;
    }

    public void setRectB(int rectB) {
        this.rectB = rectB;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double SquareOfTriangle() {
        return (double) (this.katetFirst + this.katetTwo + this.gipotenuza);
    }

    public double SquareOfRectangle() {
        return (double) (this.rectA * this.rectB);
    }

    public double SquareOfCircle() {
        return PI * pow(this.radius, 2);
    }
}
