package pl.pattern.creational.builder;

public interface Builder {

    void setWeight(double weight);
    void setHeight(double height);
    void setWidth(double width);
    void setTvManufacturer(TVManufacturer tvManufacturer);
    void setCurved(boolean curved);
    void setRGB(boolean rgb);
}
