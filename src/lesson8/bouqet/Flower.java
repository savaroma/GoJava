package lesson8.bouqet;

public class Flower {
    protected String name;
    protected String color;

    @Override
    public String toString() {
        return "Flower {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}