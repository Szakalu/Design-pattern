package pl.pattern.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Director director = new Director();

        TVBuilder tvBuilder = new TVBuilder();
        director.constructGamingTV(tvBuilder);

        TV tv = tvBuilder.getResult();
        System.out.println(tv.getTvManufacturer() + " has RGB: " + tv.isRgb());

        TVManualBuilder tvManualBuilder = new TVManualBuilder();
        director.constructGamingTV(tvManualBuilder);

        TVManual manual = tvManualBuilder.getResult();
        manual.print();
    }
}
