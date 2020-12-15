package com.chethan.designpatterns.structural.bridge;

public interface FileDownloadImplementor {
    Object downloadFile(String path);

    boolean storeFile(Object file);
}
