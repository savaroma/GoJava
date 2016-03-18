package lesson8.bouqet;

import java.util.ArrayList;
import java.util.List;

public class RoseBush {
    List<Flower> rosesList;

    public RoseBush() {
        this.rosesList = new ArrayList<>();
    }

    public void includeRose(Flower rose) {
        this.rosesList.add(rose);
    }

    public void getInfo() {
        if (rosesList.size() > 0) {
            System.out.println("Rosebush contains from: ");
            rosesList
                    .forEach(System.out::println);
        } else {
            System.out.println("Rosebush not contains Roses");
        }
    }
}