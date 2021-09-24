package pl.pattern.factory.abstractt;

public class BUSEngine implements Engine{

    private int power;
    private int capacity;
    private String name;

    public BUSEngine(int power, int capacity) {
        this.power = power;
        this.capacity = capacity;
        this.name = "BUS Engine";
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
