package com.chethan.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DVDInfo implements Comparable<DVDInfo>{
    private String title;
    private String genre;
    private String author;

    public DVDInfo(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString() {
        return "DVDInfo{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(DVDInfo o) {
        return title.compareTo(o.title);
    }

    public static void main(String[] args) {
        List<DVDInfo> dvds = new ArrayList<>();
        dvds.add(new DVDInfo("1","Z","D"));
        dvds.add(new DVDInfo("2","z","C"));
        dvds.add(new DVDInfo("3","Y","B"));
        dvds.add(new DVDInfo("4","y","A"));
        Collections.sort(dvds);
        System.out.println(dvds);

        Collections.sort(dvds, new GenreSort());
        System.out.println(dvds);

        Collections.sort(dvds, (a,b)->(a.getAuthor().compareTo(b.getAuthor())));
        System.out.println(dvds);

        Collections.sort(dvds, Comparator.comparing(DVDInfo::getAuthor).reversed());
        System.out.println(dvds);
    }
}

class GenreSort implements Comparator<DVDInfo> {
    @Override
    public int compare(DVDInfo o1, DVDInfo o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
