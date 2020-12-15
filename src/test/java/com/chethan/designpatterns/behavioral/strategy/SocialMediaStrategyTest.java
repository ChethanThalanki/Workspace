package com.chethan.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

// Collections.sort()
public class SocialMediaStrategyTest {
    @Test
    void facebookStrategy(){
        SocialMediaContext socialMediaContext = new SocialMediaContext();
        socialMediaContext.setStrategy(new FaceBook());
        socialMediaContext.connect("Chethan");

        socialMediaContext.setStrategy(new Instagram());
        socialMediaContext.connect("Chethan");
    }
}
