package com.chethan.designpatterns.structural.bridge;

public interface FileDownloadAbstraction {
    Object download(String path);

    void store(Object file);

    boolean delete();
}
