package com.chethan.designpatterns.structural.bridge;

import com.chethan.designpatterns.structural.bridge.FileDownloadAbstraction;
import com.chethan.designpatterns.structural.bridge.FileDownloadAbstractionImpl;
import com.chethan.designpatterns.structural.bridge.FileDownloadImplementor;
import com.chethan.designpatterns.structural.bridge.LinuxDownloadImpl;
import org.junit.jupiter.api.Test;

// Bridge pattern decouple an abstraction from its implementation so that the two can vary independently.
// prefer composition over inheritance“


// Shape --> Rectangle --> Blue Rectangle, Green Circle
//       --> Circle --> Blue Circle, Green Circle
// After Bridge
// Color --> Blue, Green
// Shape --> Rectangle(color) Circle(Color)
public class BridgeTest {
    @Test
    void linuxDownloadTest(){
        FileDownloadImplementor implementor = new LinuxDownloadImpl();
        FileDownloadAbstraction abstraction = new FileDownloadAbstractionImpl(implementor);

        abstraction.download("/usr/loca/bin");
    }
}
