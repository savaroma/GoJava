package lesson6.bouqet;

public class Bouquet {
    private Flower[] flowers;
    public int flowersQuantity;

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 1) {
            throw new NegativeArraySizeException("Bouquet should contain at least one flower!");
        }

        if (bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain odd number of flowers!");
        }

        flowers = new Flower[bouquetSize];
        flowersQuantity = 0;
    }
}
