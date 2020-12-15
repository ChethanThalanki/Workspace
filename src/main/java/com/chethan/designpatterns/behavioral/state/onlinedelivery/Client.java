package com.chethan.designpatterns.behavioral.state.onlinedelivery;

public class Client {
    public static void main(String[] args)
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
