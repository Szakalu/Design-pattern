package pl.pattern.creational.builder;

public class TV {

    private double weight;
    private double height;
    private double width;
    private TVManufacturer tvManufacturer;
    private boolean curved;
    private boolean rgb;

    public TV(double weight, double height, double width, TVManufacturer tvManufacturer, boolean curved, boolean rgb) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.tvManufacturer = tvManufacturer;
        this.curved = curved;
        this.rgb = rgb;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public TVManufacturer getTvManufacturer() {
        return tvManufacturer;
    }

    public boolean isCurved() {
        return curved;
    }

    public boolean isRgb() {
        return rgb;
    }
}
