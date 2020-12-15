package com.chethan.designpatterns.structural.bridge;

public class FileDownloadAbstractionImpl implements FileDownloadAbstraction{

    FileDownloadImplementor implementor = null;

    public FileDownloadAbstractionImpl(FileDownloadImplementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public Object download(String path) {
        System.out.println("Downloading file in path : "+path);
        return implementor.downloadFile(path);
    }

    @Override
    public void store(Object file) {
        implementor.storeFile(file);
    }

    @Override
    public boolean delete() {
        return false;
    }
}
