package com.chethan.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;

// AbstractList, AbstractSet, InputStream
public class HouseTest {
    @Test
    void glassHouseTest(){
        House glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }

    @Test
    void woodenHouseTest(){
        House woodHouse = new WoodHouse();
        woodHouse.buildHouse();
    }
}
