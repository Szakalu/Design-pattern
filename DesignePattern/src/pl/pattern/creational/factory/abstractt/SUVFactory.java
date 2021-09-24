package pl.pattern.creational.factory.abstractt;

public class SUVFactory implements CarFactory{


    @Override
    public FrontWindow createFrontWindow() {
        return new SUVFrontWindow(200, 300);
    }

    @Override
    public Engine createEngine() {
        return new SUVEngine(320,2500);
    }
}
