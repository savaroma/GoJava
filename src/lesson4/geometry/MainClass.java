package lesson4.geometry;

public class MainClass {
    public static void main(String[] args) {
        Calculate figures = new Calculate();
        figures.setKatetFirst(3);
        figures.setKatetTwo(4);
        figures.setGipotenuza(5);
        figures.setRectA(20);
        figures.setRectB(15);
        figures.setRadius(100);

        System.out.println("Circle square is: " + figures.SquareOfCircle());
        System.out.println("Rectangle square is: " + figures.SquareOfRectangle());
        System.out.println("Triangle square is: " + figures.SquareOfTriangle());
    }
}
