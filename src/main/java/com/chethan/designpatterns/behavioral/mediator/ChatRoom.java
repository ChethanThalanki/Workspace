package com.chethan.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom{
    private Map<Integer, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, int userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        usersMap.put(user.getId(), user);
    }
}
