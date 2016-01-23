package lesson8.bouqet;

import java.util.ArrayList;
import java.util.Arrays;

public class Bouquet {
    public String name;
    Flower[] flowers = {};
    ArrayList<Flower> flowersList;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowersList = new ArrayList<>(Arrays.asList(flowers)); //это не нужно. Нужен только лист, массив ушел в прошлое.
        this.flowersList.add(flower);
    }

    public void addFlower(Flower flower) {
        this.flowersList.add(flower);
    }

    public void removeFlower() {
        flowersList.remove(flowersList.size() - 1);
    }

    public void info() { //название метода должно начинаться с глагола
        //принт выносим в мейн, из класса надо возвращать инфу в виде строки
        System.out.println(name + " contains from: ");
        flowersList
                .forEach(System.out::println);
    }
}
