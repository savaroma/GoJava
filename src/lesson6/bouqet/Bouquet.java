package lesson6.bouqet;

public class Bouquet {
    private Flower[] flowers; //не хватает геттера хотя бы для этого поля, а то совсем не достучаться
    public int flowersQuantity; //почему публичная переменная?

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 1) { //0 - это не отрицательное число
            throw new NegativeArraySizeException("Bouquet should contain at least one flower!");
        }

        if (bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain odd number of flowers!");
        }

        flowers = new Flower[bouquetSize];
        flowersQuantity = 0; //ну и к чему этот ноль?))
    }
}
