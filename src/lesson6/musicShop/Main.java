package lesson6.musicShop;

import sun.awt.image.GifImageDecoder;

public class Main {
    public static void main(String[] args) {

        System.out.println("MUSIC SHOP");
        MusicShop shop = new MusicShop(1);
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();

        try {
            shop.addMusicalInstrument(guitar);
            shop.addMusicalInstrument(piano);
            shop.addMusicalInstrument(trumpet);
        } catch (RuntimeException e) {
            System.out.println("[Exception]: " + e.getMessage());
        }

    }
}
