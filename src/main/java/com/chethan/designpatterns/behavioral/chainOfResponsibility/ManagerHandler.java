package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public class ManagerHandler implements IServiceRequest{

    @Override
    public void handleRequest(AmountRequest amountRequest) {
        if(amountRequest.getAmount() <= 10000){
            System.out.println("Manager approved! : " +amountRequest.getAmount());
        }else{
            System.out.printf("Manager limit 10000 exceeded for %s, Forwarding the request to Director \n", amountRequest.getAmount());
            getNextHandler().handleRequest(amountRequest);
        }
    }

    @Override
    public IServiceRequest getNextHandler() {
        return new DirectorHandler();
    }
}
