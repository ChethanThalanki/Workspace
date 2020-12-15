package com.chethan.designpatterns.structural.proxy;

public class ProxyImage implements Image{

    private GraphicalImage sourceImg;
    private String url;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void displayImage() {
        if(sourceImg == null){
            sourceImg = new GraphicalImage(url);
        }
        System.out.println("Displaying image from proxy");
        sourceImg.displayImage();
    }
}
