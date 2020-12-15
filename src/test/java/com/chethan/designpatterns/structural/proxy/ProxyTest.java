package com.chethan.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;
// placeholder for another object to control access to it.
// Hibrenate query response returns proxy objects
public class ProxyTest {
    @Test
    void testProxy(){
        ProxyImage proxyImage = new ProxyImage("http://URL");
        proxyImage.displayImage();
    }
}
