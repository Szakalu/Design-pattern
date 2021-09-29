package pl.pattern.behavioral.chainofresponsibility;

public class HandlerDivisibility implements IHandlerDivisibility{

    private HandlerDivisibility next = null;
    private int divisor = 1;

    public HandlerDivisibility(int divisor) {
        this.divisor = divisor;
    }

    public HandlerDivisibility setNextHandler(HandlerDivisibility next){
        this.next = next;
        return this.next;
    }

    public boolean handler(int number){
        if(number % divisor == 0){
            if(next != null){
                return next.handler(number);
            }
            return true;
        }
        return false;
    }

}
