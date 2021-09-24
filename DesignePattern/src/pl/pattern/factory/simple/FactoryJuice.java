package pl.pattern.factory.simple;

public class FactoryJuice {

    public enum JuiceType{
        STRAWBERRY, APPLE
    }

    private FactoryJuice(){};

    public static Juice getJuice(JuiceType juiceType){
        switch (juiceType){
            case APPLE:
                return new AppleJuice(4.00);
            case STRAWBERRY:
                return new StrawberryJuice(6.00);
        }
        return null;
    }
}
