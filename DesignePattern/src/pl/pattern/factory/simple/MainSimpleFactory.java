package pl.pattern.factory.simple;

public class MainSimpleFactory {

    public static void main(String[] args) {
        Juice juice = FactoryJuice.getJuice(FactoryJuice.JuiceType.APPLE);
        System.out.println(juice.getName() + " " + juice.getPrice());
    }

}
