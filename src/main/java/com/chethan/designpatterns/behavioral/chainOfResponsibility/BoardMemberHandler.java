package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public class BoardMemberHandler implements IServiceRequest{
    AmountRequest amountRequest;
    @Override
    public void handleRequest(AmountRequest amountRequest) {
        if(amountRequest.getAmount() < 150000){
            System.out.println("Board Member approved : "+ amountRequest.getAmount());
        }else{
            System.out.println("Amount request rejected : " + amountRequest.getAmount());
        }
    }

    @Override
    public IServiceRequest getNextHandler() {
        return null;
    }
}
