package com.chethan.java.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MavenCleanUp extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException, InterruptedException {
        MavenCleanUp fileVisit = new MavenCleanUp();

        Runnable r = () -> {
            try{Files.walkFileTree(Paths.get("/Users/i322682/SAPDevelop/maven/repository/com/sap/ariba/an/"), fileVisit);}catch (Exception e){
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
        if(file.toString().contains("mDev-SNAPSHOT") || file.toString().contains("mRel-SNAPSHOT")) {
            //System.out.println("Deleting file " + file);
            Files.delete(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if((dir.toString().contains("mDev-SNAPSHOT") || dir.toString().contains("mRel-SNAPSHOT")) && Files.isDirectory(dir)) {
            //System.out.println("Deleting " + dir);
            Files.delete(dir);
        }
        return FileVisitResult.CONTINUE;
    }

}