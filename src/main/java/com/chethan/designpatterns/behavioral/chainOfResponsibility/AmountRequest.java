package com.chethan.designpatterns.behavioral.chainOfResponsibility;

public class AmountRequest{

    private long amount;

    public AmountRequest(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }
}
