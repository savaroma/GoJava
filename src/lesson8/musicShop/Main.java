package lesson8.musicShop;

public class Main {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop("MUSIC SHOP");
        musicShop.addToShowcase(new Guitar());
        musicShop.addToShowcase(new Piano());
        musicShop.addToShowcase(new Trumpet());
        musicShop.addToShowcase(new Trumpet());
        musicShop.addToShowcase(new Piano());
        musicShop.addToShowcase(new Piano());
        musicShop.info();
        System.out.println();
        musicShop.removeFromShowcase(new Trumpet());
        System.out.println();
        musicShop.removeFromShowcase(new Piano());
    }
}
