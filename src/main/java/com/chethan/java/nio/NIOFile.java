package com.chethan.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOFile {
    public static void main(String[] args) throws IOException {
        File dir = new File("files");
        dir.mkdir();
        File file = new File("files","d.txt");
        System.out.printf("Converting io.File %s to nio.Path ==> %s \n", file, file.toPath());
        try(FileOutputStream fos= new FileOutputStream(file)){ // Creates file if it does not exist
           fos.write("Hello NIO file".getBytes(StandardCharsets.UTF_8));
           fos.write("Hello NIO file - line 2".getBytes(StandardCharsets.UTF_8));
           fos.flush();
        }
        try(FileInputStream fis= new FileInputStream(file)){ // Creates file if it does not exist
            byte[] in = new byte[50];
            int size = fis.read(in);
            System.out.println(new String(in));
            for(byte b : in ){
                System.out.print((char)b);
            }
            System.out.println();
        }

        String[] files = dir.list();
        for(String f : files){
            System.out.println("Found " + f);
        }

        Path path = Paths.get("files/dir2/subdir1");
        Files.createDirectories(path);

        Path a = Paths.get("files/a.txt");
        Path newA = Paths.get("files/dir1/a.txt");
        Files.copy(a, newA, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);

        Path b = Paths.get("files/b.txt");
        Path newB = Paths.get("files/dir2/subdir1/b-copy.txt");
        if(Files.notExists(newB)) {
            Files.move(b, newB, StandardCopyOption.ATOMIC_MOVE);
        }
        System.out.println(newB.getFileName());
        System.out.println(newB.getNameCount());
        System.out.println(newB.getName(0));
        System.out.println(newB.getName(1));
        System.out.println(newB.getName(2));
        System.out.println(newB.getName(3));
        System.out.println(newB.subpath(0,2));
        System.out.println(newB.getRoot());
        System.out.println(newB.getParent());


        Path dir2 = Paths.get("files/dir2");
        Path bCopy = Paths.get("subdir1/b-copy.txt");
        Path bCopyFullPath = dir2.resolve(bCopy);
        System.out.println(Files.exists(bCopyFullPath));
        System.out.println(Files.getLastModifiedTime(bCopyFullPath));


        BasicFileAttributes basicFileAttributes = Files.readAttributes(bCopyFullPath, BasicFileAttributes.class);
    }
}
