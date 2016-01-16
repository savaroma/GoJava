package lesson6.bouqet;

public class Bouquet {
    private static Flower[] flowers;

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 0) {
            throw new NegativeArraySizeException("Bouquet should contain at least one flower!");
        }

        if (bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain odd number of flowers!");
        }

        flowers = new Flower[bouquetSize];
    }

    public static Flower[] getFlowers() {
        return flowers;
    }

}
