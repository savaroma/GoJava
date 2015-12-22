package lesson4.geometry;

import static java.lang.Math.*;

public class Calculator {
    private int heightOne, heightTwo, heightThree, rectA, rectB;
    private double radius;

    public void setHeightFirst(int heightOne) {
        this.heightOne = heightOne;
    }

    public void setHeightTwo(int heightTwo) {
        this.heightTwo = heightTwo;
    }

    public void setHeightThree(int heightThree) {
        this.heightThree = heightThree;
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

    public double calculateAreaOfTriangle() {
        int p = (this.heightOne + this.heightTwo + this.heightThree)/2;
        return sqrt(p * (p - this.heightOne) * (p - this.heightTwo) * (p - this.heightThree));
    }

    public double calculateAreaOfRectangle() {
        return (double) (this.rectA * this.rectB);
    }

    public double calculateAreaOfCircle() {
        return PI * pow(this.radius, 2);
    }
}
