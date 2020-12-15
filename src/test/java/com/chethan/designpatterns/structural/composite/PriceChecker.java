package com.chethan.designpatterns.structural.composite;

import com.chethan.designpatterns.structural.composite.AssemblyPart;
import com.chethan.designpatterns.structural.composite.Capacitor;
import com.chethan.designpatterns.structural.composite.ElectricPart;
import com.chethan.designpatterns.structural.composite.MotherBoard;
import com.chethan.designpatterns.structural.composite.PriceHelper;
import com.chethan.designpatterns.structural.composite.Resistor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PriceChecker {
    ElectricPart resistor;
    ElectricPart capacitor;
    AssemblyPart motherBoard;

    @BeforeEach
    void init(){
        resistor = new Resistor();
        capacitor = new Capacitor();

        motherBoard = new MotherBoard();
        motherBoard.addPart(resistor);
        motherBoard.addPart(resistor);
        motherBoard.addPart(capacitor);
        motherBoard.addPart(capacitor);
    }

    @Test
    void resistorPriceCheck(){
        Assertions.assertEquals(PriceHelper.getPrice(resistor), resistor.getPrice());
    }

    @Test
    void capacitorPriceCheck(){
        Assertions.assertEquals(PriceHelper.getPrice(capacitor), capacitor.getPrice());
    }

    @Test
    void motherBoardPriceCheck(){
        float epsilon = Float.MIN_NORMAL;
        float price = 10 + (resistor.getPrice() + capacitor.getPrice()) * 2;
        System.out.println(Float.compare(price, PriceHelper.getPrice(motherBoard))<epsilon);
        Assertions.assertEquals(PriceHelper.getPrice(motherBoard), price, 01.f);
    }

}
