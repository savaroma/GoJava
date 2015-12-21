package lesson4.geometry;

import static java.lang.Math.*;

public class Calculate {
    private int heightOne, heightTwo, heitghThree, rectA, rectB;
    private double radius;

    public void setKatetFirst(int heightOne) {
        this.heightOne = heightOne;
    }

    public void setKatetTwo(int heightTwo) {
        this.heightTwo = heightTwo;
    }

    public void setGipotenuza(int heitghThree) {
        this.heitghThree = heitghThree;
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

    public int SquareOfTriangle() {
        return (this.heightOne + this.heightTwo + this.heitghThree)/2;
    }

    public double SquareOfRectangle() {
        return (double) (this.rectA * this.rectB);
    }

    public double SquareOfCircle() {
        return PI * pow(this.radius, 2);
    }
}
