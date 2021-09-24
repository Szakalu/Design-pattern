package pl.pattern.factory.abstractt;

public interface CarFactory {

    FrontWindow createFrontWindow();
    Engine createEngine();

}
