package lesson6.bouqet;

public class Bouquet {
    public static int INIT_QUANTITY = 0;
    private Flower[] flowers;
    private int flowersQuantity;

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 0) {
            throw new NegativeArraySizeException("Bouquet should contain at least one flower!");
        }

        if (bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain odd number of flowers!");
        }

        flowers = new Flower[bouquetSize];
        flowersQuantity = INIT_QUANTITY;
    }

    public int getFlowersQuantity() {
        return flowersQuantity;
    }

    public void setFlowersQuantity(int flowersQuantity) {
        this.flowersQuantity = flowersQuantity;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }
}
