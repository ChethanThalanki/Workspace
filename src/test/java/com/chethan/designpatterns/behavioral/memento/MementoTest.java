package com.chethan.designpatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

public class MementoTest {
    @Test
    void mementoTest(){
        Article article = new Article(1,"My Article");
        article.setContent("Content1");
        ArticleMemento memento = article.createMemento();
        System.out.println(article);
        article.setContent("Content2");
        System.out.println("After update \n"+ article);
        article.restore(memento);
        System.out.println("After restore \n"+ article);
    }
}
