package com.chethan.java.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TargetFilesDelete extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException, InterruptedException {
        TargetFilesDelete fileVisit = new TargetFilesDelete();

        Runnable r = () -> {
            try{Files.walkFileTree(Paths.get("/Users/i322682/SAPDevelop/AN/src/git/AN/microservices/"), fileVisit);}catch (Exception e){
                e.printStackTrace();
            }};
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.start();
        t.join();
        System.out.println("Completed deleting of files");
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(file.toString().contains("/target/")) {
            //System.out.println("Deleting file " + file);
            Files.delete(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if(dir.toString().contains("/target") && !dir.toString().contains("/targets") && Files.isDirectory(dir)) {
            //System.out.println("Deleting " + dir);
            Files.delete(dir);
        }
        return FileVisitResult.CONTINUE;
    }

}