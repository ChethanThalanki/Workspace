package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public class VicePresidentHandler implements IServiceRequest{

    @Override
    public void handleRequest(AmountRequest amountRequest) {
        if(amountRequest.getAmount() < 100000){
            System.out.println("Vice President approved " + amountRequest.getAmount());
        }else{
            System.out.printf("VP limit 100000 exceeded for %s, Forwarding the request to Board \n", amountRequest.getAmount());
            getNextHandler().handleRequest(amountRequest);
        }
    }

    @Override
    public IServiceRequest getNextHandler() {
        return new BoardMemberHandler();
    }
}
