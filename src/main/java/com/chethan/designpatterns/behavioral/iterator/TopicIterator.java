package com.chethan.designpatterns.behavioral.iterator;

public class TopicIterator implements CustomIterator<Topic> {

    private Topic[] topics;
    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        position = -1;
    }

    @Override
    public void reset() {
        position = -1;
    }

    @Override
    public Topic next() {
        return topics[++position];
    }

    @Override
    public boolean hasNext() {
        return position + 1 < topics.length;
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }
}
