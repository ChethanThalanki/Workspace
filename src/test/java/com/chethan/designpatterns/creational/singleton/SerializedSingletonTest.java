package com.chethan.designpatterns.creational.singleton;

import com.chethan.designpatterns.creational.singleton.SerializedSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializedSingletonTest {
    static SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();

    @Test
    public void test() {
        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutput oos = new ObjectOutputStream(fos)){
            oos.writeObject(serializedSingleton);

            serializedSingleton.setI(20);
            try(ObjectInput ois = new ObjectInputStream(new FileInputStream("serial.txt"))){
                SerializedSingleton serializedSingleton1 = (SerializedSingleton) ois.readObject();
                Assertions.assertEquals(serializedSingleton.getI(), serializedSingleton1.getI());
            }
            Path path = Paths.get("serial.txt");
            Files.delete(path);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
