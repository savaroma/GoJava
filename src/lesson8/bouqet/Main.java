package lesson8.bouqet;

public class Main {
    public static final String COLOR_RED = "red";
    public static final String COLOR_WHITE = "white";
    public static final String COLOR_YELLOW = "yellow";
    public static final String WITH_SPIKE = "with spike";
    public static final String WITHOUT_SPIKE = "without spike";

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet("Bouquet", new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Aster(COLOR_WHITE));
        bouquet.addFlower(new Tulip(COLOR_YELLOW));
        bouquet.getInfo();
        System.out.println();

        bouquet.removeFlower();
        bouquet.removeFlower();
        bouquet.getInfo();
        System.out.println();

        RoseBush rosebush = new RoseBush();
        rosebush.includeRose(new Rose(COLOR_WHITE,WITHOUT_SPIKE));
        rosebush.includeRose(new Rose(COLOR_RED,WITH_SPIKE));
        rosebush.includeRose(new Rose(COLOR_WHITE,WITHOUT_SPIKE));
        rosebush.getInfo();
    }
}
