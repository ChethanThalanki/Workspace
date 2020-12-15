package com.chethan.designpatterns.behavioral.visitor;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class VisitorTest {
    private LinuxRouterVisitor linuxRouterVisitor ;
    private MacRouterVisitor macRouterVisitor ;
    private DLinkRouter dLinkRouter;
    private TPLinkRouter tpLinkRouter;

    @Before
    public void init(){
        linuxRouterVisitor = new LinuxRouterVisitor();
        macRouterVisitor = new MacRouterVisitor();
        dLinkRouter = new DLinkRouter();
        tpLinkRouter = new TPLinkRouter();
    }

    @Test
    void linuxRouterVisitorTest(){
        init();
        dLinkRouter.accept(linuxRouterVisitor); // Double dispatch
        tpLinkRouter.accept(linuxRouterVisitor);
    }

    @Test
    @Order(-1)
    void macRouterVisitorTest(){
        init();
        dLinkRouter.accept(macRouterVisitor); // Double dispatch
        tpLinkRouter.accept(macRouterVisitor);
    }
}
