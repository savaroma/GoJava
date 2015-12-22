package lesson4.geometry;

import static java.lang.Math.*;

public class Calculate {
    private int heightOne, heightTwo, heightThree, rectA, rectB;
    private double radius;

    public void setHeightFirst(int heightOne) {
        this.heightOne = heightOne;
    }

    public void setHeightTwo(int heightTwo) {
        this.heightTwo = heightTwo;
    }

    public void setheightThree(int heightThree) {
        this.heightThree = heightThree;
    }//смотрим на подчеркивания идеи! каждое следующее слово, кроме первого в названии метода - с большой буквы

    public void setRectA(int rectA) {
        this.rectA = rectA;
    }

    public void setRectB(int rectB) {
        this.rectB = rectB;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double SquareOfTriangle() { //первая буква в названии метода - маленькая. первое слово должно быть глаголом
        int p = (this.heightOne + this.heightTwo + this.heightThree)/2;
        return sqrt(p * (p - this.heightOne) * (p - this.heightTwo) * (p - this.heightThree));
    }

    public double SquareOfRectangle() {
        return (double) (this.rectA * this.rectB);
    }

    public double SquareOfCircle() {
        return PI * pow(this.radius, 2);
    }
}
