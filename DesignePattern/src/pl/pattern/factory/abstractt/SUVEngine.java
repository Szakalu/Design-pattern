package pl.pattern.factory.abstractt;

public class SUVEngine implements Engine{

    private int power;
    private int capacity;
    private String name;

    public SUVEngine(int power, int capacity) {
        this.power = power;
        this.capacity = capacity;
        this.name = "SUV Engine";
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getName() {
        return name;
    }
}
