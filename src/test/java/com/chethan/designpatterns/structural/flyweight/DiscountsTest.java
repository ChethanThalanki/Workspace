package com.chethan.designpatterns.structural.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Adding or Removing membership level
// java.lang.String --> internally maintains pool

// Flyweight(CustomerLevel) should be immuntable
public class DiscountsTest {
    Customer silverCustomer ;

    @BeforeEach
    void init(){
        silverCustomer = new Customer("C1",22, CustomerLevel.SILVER);
    }
    @Test
    void testSilverDiscount(){
        Assertions.assertEquals(DiscountUtil.priceAfterDiscount(silverCustomer, 1250), 1250 * 0.9);
    }
}
