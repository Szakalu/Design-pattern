package pl.pattern.factory.simple;

public class AppleJuice implements Juice{

    private double price;
    private String name;

    public AppleJuice(double price) {
        this.price = price;
        this.name = "Apple Juice";
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
