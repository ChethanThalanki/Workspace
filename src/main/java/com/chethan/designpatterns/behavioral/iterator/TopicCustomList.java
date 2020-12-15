package com.chethan.designpatterns.behavioral.iterator;

public class TopicCustomList implements CustomList<Topic>{

    private Topic[] topics;

    public TopicCustomList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public CustomIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}
