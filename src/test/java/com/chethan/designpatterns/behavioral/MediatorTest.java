package com.chethan.designpatterns.behavioral;

import com.chethan.designpatterns.behavioral.mediator.ChatRoom;
import com.chethan.designpatterns.behavioral.mediator.ChatUser;
import com.chethan.designpatterns.behavioral.mediator.User;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void testSendMessage(){
        ChatRoom chatGroup1 = new ChatRoom();

        User user1 = new ChatUser(1, "User1", chatGroup1);
        User user2 = new ChatUser(2, "User2", chatGroup1);
        User user3 = new ChatUser(3, "User3", chatGroup1);
        User user4 = new ChatUser(4, "User4", chatGroup1);

        chatGroup1.addUser(user1);
        chatGroup1.addUser(user2);
        chatGroup1.addUser(user3);
        chatGroup1.addUser(user4);

        user1.send("Message1", 2);
        user2.send("Message2", 4);
        user3.send("Message3", 2);
    }
}
