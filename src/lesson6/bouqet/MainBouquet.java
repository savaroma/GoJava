package lesson6.bouqet;

public class MainBouquet {
    public static void main(String[] args) {
        try {
            Bouquet bouquet = new Bouquet(-1);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bouquet bouquet = new Bouquet(4);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bouquet bouquet = new Bouquet(5);
            System.out.println("There was exception!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
