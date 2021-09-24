package pl.pattern.creational.factory.abstractt;

public interface CarFactory {

    FrontWindow createFrontWindow();
    Engine createEngine();

}
