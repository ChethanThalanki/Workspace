package com.chethan.java.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreams {
    public static void main(String[] args) {
        Path filesDir = Paths.get("files");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(filesDir)){
            for(Path p : stream){
                System.out.print(p + "\t\t");
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Parsing only txt files");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(filesDir, "*[txt]")){
            for(Path p : stream){
                System.out.print(p + "\t\t");
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
