package com.chethan.designpatterns.structural.bridge;

public class LinuxDownloadImpl implements FileDownloadImplementor{
    @Override
    public Object downloadFile(String path) {
        System.out.println("LinuxDownloadImpl downloadFile");
        return new Object();
    }

    @Override
    public boolean storeFile(Object file) {
        System.out.println("Downloading file in linux");
        return true;
    }
}
