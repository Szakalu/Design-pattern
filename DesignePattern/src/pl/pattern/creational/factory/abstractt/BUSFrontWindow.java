package pl.pattern.creational.factory.abstractt;

public class BUSFrontWindow implements FrontWindow{

    private double height;
    private double width;
    private String name;

    public BUSFrontWindow(double height, double width) {
        this.height = height;
        this.width = width;
        this.name = "BUS Front Window";
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return name;
    }
}
