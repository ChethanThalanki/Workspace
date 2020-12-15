package com.chethan.designpatterns.creational.builder.loanapp.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class JUnit5Test {
    @Test
    void testCase()
    {
        //Test will pass
        Assertions.assertEquals(4, 2+2);

        //Test will fail
        Assertions.assertEquals(3, 2+1, "Calculator.add(2, 2) test failed");

        //Test will pass
        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Array Equal Test");

        //Test will fail
        Supplier<String> messageSupplier  = () -> "Supplier Calculator.add(2, 2) test failed";
        Assertions.assertEquals(3, 2, messageSupplier);
    }

    @Test
    void testExpectedException() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void testExpectedExceptionWithSuperType() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void testExpectedExceptionFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("1");
        });
    }

    @Test
    void iterableTest()
    {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1,2,4,3));

        //Test will pass
        Assertions.assertIterableEquals(listOne, listTwo);

        //Test will fail
        Assertions.assertIterableEquals(listOne, listThree);

        //Test will fail
        Assertions.assertIterableEquals(listOne, listFour);
    }

    @Test
    void failTest() {

        Assertions.fail("not found good reason to pass");
        Assertions.fail(JUnit5Test::message);
    }

    private static String message () {
        return "not found good reason to pass";
    }
}
