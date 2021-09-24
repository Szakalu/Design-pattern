package pl.pattern.factory.abstractt;

public class MainAbstractFactory {


    private static CarFactory getFactoryType(String carType){
        switch (carType){
            case "SUV":
                return new SUVFactory();
            case "BUS":
                return new BUSFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        CarFactory carFactory = getFactoryType("BUS");
        Engine engine = carFactory.createEngine();
        FrontWindow window = carFactory.createFrontWindow();
        System.out.println(engine.getName() + " Power:" + engine.getPower() + " Capacity:" + engine.getCapacity());
        System.out.println(window.getName() + " Height:" + window.getHeight()
                + " Width:" + window.getWidth());
    }

}
