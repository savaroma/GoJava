package lesson6.bouqet;

import java.util.Arrays;

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
            System.out.println("It is not an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
