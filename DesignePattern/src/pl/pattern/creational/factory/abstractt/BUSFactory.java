package pl.pattern.creational.factory.abstractt;

public class BUSFactory implements CarFactory{
    @Override
    public FrontWindow createFrontWindow() {
        return new BUSFrontWindow(200,400);
    }

    @Override
    public Engine createEngine() {
        return new BUSEngine(220,3000);
    }
}
