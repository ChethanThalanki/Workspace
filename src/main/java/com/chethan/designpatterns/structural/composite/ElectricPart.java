package com.chethan.designpatterns.structural.composite;

public abstract class ElectricPart {

    private String name;
    private String description;
    private float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricPart{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
