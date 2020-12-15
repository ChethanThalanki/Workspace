package com.chethan.designpatterns.behavioral.visitor;

public interface RouterVisitor {
    void visit(DLinkRouter dLinkRouter);
    void visit(TPLinkRouter tpLinkRouter);
}
