package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public class DirectorHandler implements IServiceRequest {
    AmountRequest request;

    @Override
    public void handleRequest(AmountRequest amountRequest) {
        if(amountRequest.getAmount() <= 50000){
            System.out.println("Director Approved : " + amountRequest.getAmount());
        }else{
            System.out.printf("Director limit 50000 exceeded for %s, Forwarding the request to VP \n", amountRequest.getAmount());
            getNextHandler().handleRequest(amountRequest);
        }
    }

    @Override
    public IServiceRequest getNextHandler() {
        return new VicePresidentHandler();
    }
}
