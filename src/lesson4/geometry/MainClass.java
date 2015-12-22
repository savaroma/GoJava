package lesson4.geometry;

public class MainClass {
    public static void main(String[] args) {
        Calculator figures = new Calculator();
        figures.setHeightFirst(3);
        figures.setHeightTwo(4);
        figures.setHeightThree(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        System.out.println("Circle square is: " + figures.calculateAreaOfCircle());
        System.out.println("Rectangle square is: " + figures.calculateAreaOfRectangle());
        System.out.println("Triangle square is: " + figures.calculateAreaOfTriangle());
    }
}
