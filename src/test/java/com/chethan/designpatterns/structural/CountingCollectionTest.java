package com.chethan.designpatterns.structural;

import com.chethan.designpatterns.structural.decorator.collectionsapi.CustomArrayList;
import com.chethan.designpatterns.structural.decorator.collectionsapi.CustomCollection;
import com.chethan.designpatterns.structural.decorator.impl.AddCountingList;
import org.junit.jupiter.api.Test;

public class CountingCollectionTest {
    @Test
    void addtest(){
        CustomCollection collection = new CustomArrayList();
        collection.add(1);
        collection.add(3);
        collection.add(4);
        AddCountingList addCountingList = new AddCountingList(collection);
        addCountingList.add(1);
        addCountingList.add(1);
        addCountingList.add(1);
        System.out.println(addCountingList.getCount());
    }
}
