package com.chethan.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

public class TopicIteratorTest {
    @Test
    void customIteratorTest(){
        Topic t1 = new Topic("t1");
        Topic t2 = new Topic("t2");
        Topic t3 = new Topic("t3");
        Topic[] topics = new Topic[3];
        topics[0] = t1;
        topics[1] = t2;
        topics[2] = t3;

        TopicCustomList topicCustomList = new TopicCustomList(topics);
        TopicIterator iterator = (TopicIterator) topicCustomList.iterator();
        while(iterator.hasNext()){
            Topic t = iterator.next();
            System.out.println(iterator.currentItem());
        }
    }
}
