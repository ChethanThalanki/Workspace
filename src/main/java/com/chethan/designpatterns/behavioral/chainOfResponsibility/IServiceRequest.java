package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public interface IServiceRequest {
    void handleRequest(AmountRequest amountRequest);
    IServiceRequest getNextHandler();
}
