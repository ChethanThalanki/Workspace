package com.chethan.designpatterns.structural.proxy;

import java.net.URL;
import java.net.URLConnection;

public class GraphicalImage implements Image{

    private byte[] imageData;

    public GraphicalImage(String urlString){
        try {
            URL imageURL = new URL(urlString);
            URLConnection conn = imageURL.openConnection();
            //and read bytes into imageData field
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void displayImage(){
        //draw the bytes in imageData field on to the given canvas
        System.out.println("displaying image!!");
    }

}
