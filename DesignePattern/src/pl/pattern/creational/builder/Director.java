package pl.pattern.creational.builder;

public class Director {


    public Director() {
    }

    public void constructGamingTV(Builder builder){
        builder.setWeight(5.0);
        builder.setHeight(40.5);
        builder.setWidth(60.8);
        builder.setTvManufacturer(TVManufacturer.TUMSONG);
        builder.setRGB(true);
        builder.setCurved(true);
    }

    public void constructLivingRoomTV(Builder builder){
        builder.setWeight(10.0);
        builder.setHeight(90.7);
        builder.setWidth(160.0);
        builder.setTvManufacturer(TVManufacturer.HL);
        builder.setRGB(false);
        builder.setCurved(false);
    }

}
