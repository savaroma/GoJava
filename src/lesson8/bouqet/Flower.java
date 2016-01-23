package lesson8.bouqet;

public class Flower {
    public String name; //почему паблик? если для наследника, то хотя бы protected - а то уж совсем нет инкапсуляции.
    public String color;

    @Override
    public String toString() {
        return "Flower {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}