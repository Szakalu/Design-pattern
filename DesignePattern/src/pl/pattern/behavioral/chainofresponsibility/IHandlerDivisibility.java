package pl.pattern.behavioral.chainofresponsibility;

public interface IHandlerDivisibility {

    HandlerDivisibility setNextHandler(HandlerDivisibility next);

    boolean handler(int number);
}
