package pl.pattern.creational.builder;

public class TVManualBuilder implements Builder{

    private double weight;
    private double height;
    private double width;
    private TVManufacturer tvManufacturer;
    private boolean curved;
    private boolean rgb;

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setTvManufacturer(TVManufacturer tvManufacturer) {
        this.tvManufacturer = tvManufacturer;
    }

    @Override
    public void setCurved(boolean curved) {
        this.curved = curved;
    }

    @Override
    public void setRGB(boolean rgb) {
        this.rgb = rgb;
    }

    public TVManual getResult(){
        return new TVManual(weight, height, width, tvManufacturer, curved, rgb);
    }
}
