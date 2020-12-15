package com.chethan.designpatterns.behavioral.visitor;

public class MacRouterVisitor implements RouterVisitor{
    @Override
    public void visit(DLinkRouter dLinkRouter) {
        System.out.println("MacRouterVisitor DLinkRouter");
    }

    @Override
    public void visit(TPLinkRouter tpLinkRouter) {
        System.out.println("MacRouterVisitor tpLinkRouter");
    }
}
