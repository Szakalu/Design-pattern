package pl.pattern.creational.factory.simple;

public class StrawberryJuice implements Juice{

    private double price;
    private String name;

    public StrawberryJuice(double price) {
        this.price = price;
        this.name = "Strawberry Juice";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
