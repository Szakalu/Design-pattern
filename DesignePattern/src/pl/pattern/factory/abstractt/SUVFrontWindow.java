package pl.pattern.factory.abstractt;

public class SUVFrontWindow implements FrontWindow{

    private double height;
    private double width;
    private String name;

    public SUVFrontWindow(double height, double width) {
        this.height = height;
        this.width = width;
        this.name = "SUV Front Window";
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
