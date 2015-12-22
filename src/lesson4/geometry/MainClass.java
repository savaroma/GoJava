package lesson4.geometry;

public class MainClass {
    public static void main(String[] args) {
        Calculate figures = new Calculate(); //а вот класс лучше называть существительным, напр. Calculator
        figures.setHeightFirst(3);
        figures.setHeightTwo(4);
        figures.setheightThree(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        System.out.println("Circle square is: " + figures.SquareOfCircle());
        System.out.println("Rectangle square is: " + figures.SquareOfRectangle());
        System.out.println("Triangle square is: " + figures.SquareOfTriangle());
    }
}
