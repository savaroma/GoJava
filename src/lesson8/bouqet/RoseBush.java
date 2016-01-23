package lesson8.bouqet;

import java.util.ArrayList;
import java.util.Arrays;

public class RoseBush {
    Flower[] flowers = {};
    ArrayList<Flower> flowersList; //Используйте полиморфизм, где это возможно, напр. List<Rose> list = new ArrayList<>;

    public RoseBush() {
        this.flowersList = new ArrayList<>(Arrays.asList(flowers));
    }

    public void include(Flower rose) {
        this.flowersList.add(rose);
    }

    public void info() {
        if (flowersList.size() > 0) {
            System.out.println("Rosebush contains from: ");
            flowersList
                    .forEach(System.out::println);
        } else {
            System.out.println("Rosebush not contains Roses");
        }
    }
} //Логика хромает. Куст должен содержать розы, а не цветы.
