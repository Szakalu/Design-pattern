package pl.pattern.behavioral.chainofresponsibility;

import java.util.Scanner;

public class CORMain {

    public static void main(String[] args) {
//        HandlerDivisibility handler5 = new HandlerDivisibility(5);
//        HandlerDivisibility handler3 = new HandlerDivisibility(3);
//
//        handler5.setNextHandler(handler3);
//
//        for(int i = 1; i < 100; i++){
//            System.out.println(i + " is divisible by 3 and 5");
//        }

        Scanner scanner = new Scanner(System.in);
        int nextNumber;
        HandlerDivisibility firstHandler = null;
        HandlerDivisibility lastHandler = null;
        HandlerDivisibility nextHandler;
        do{
            System.out.print("Set next divisor: ");
            nextNumber = scanner.nextInt();
            System.out.println();
            if(nextNumber != 0 ){
                if(lastHandler == null){
                    firstHandler = new HandlerDivisibility(nextNumber);
                    lastHandler = firstHandler;
                }
                else{
                    nextHandler = new HandlerDivisibility(nextNumber);
                    lastHandler.setNextHandler(nextHandler);
                    lastHandler = nextHandler;
                }
            }
        }while(nextNumber != 0);
        int i = 1;
        boolean isDivisible = false;
        while(!isDivisible){
            if(firstHandler.handler(i)){
                System.out.println(i);
                isDivisible = true;
            }
            i++;
        }
    }



}
