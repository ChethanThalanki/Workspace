package com.chethan.designpatterns.behavioral.memento;

public class Article {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(id, title, content);
        return memento;
    }

    public void restore(ArticleMemento memento){
        id = memento.getId();
        title = memento.getTitle();
        content = memento.getContent();
    }

    @Override
    public String   toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
