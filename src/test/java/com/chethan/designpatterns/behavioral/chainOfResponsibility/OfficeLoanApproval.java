package com.chethan.designpatterns.behavioral.chainOfResponsibility;

import org.junit.jupiter.api.Test;

// javax.servlet.Filter#doFilter()
public class OfficeLoanApproval {

    @Test
    void approvalFromBoard(){
        AmountRequest amountRequest = new AmountRequest(130000);
        new ManagerHandler().handleRequest(amountRequest);
    }

    @Test
    void approvalFromVP(){
        AmountRequest amountRequest = new AmountRequest(93000);
        new ManagerHandler().handleRequest(amountRequest);
    }

    @Test
    void reject(){
        AmountRequest amountRequest = new AmountRequest(193000);
        new ManagerHandler().handleRequest(amountRequest);
    }
}
