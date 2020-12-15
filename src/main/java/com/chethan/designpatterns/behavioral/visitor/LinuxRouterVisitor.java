package com.chethan.designpatterns.behavioral.visitor;

public class LinuxRouterVisitor implements RouterVisitor{
    @Override
    public void visit(DLinkRouter dLinkRouter) {
        System.out.println("LinuxRouterVisitor DLinkRouter");
    }

    @Override
    public void visit(TPLinkRouter tpLinkRouter) {
        System.out.println("LinuxRouterVisitor TPLinkRouter");
    }
}
