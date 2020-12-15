package com.chethan.designpatterns.structural.composite;

public class PriceHelper {
    public static float getPrice(ElectricPart part){
        float price = 0f;
        if(part instanceof AssemblyPart){
            AssemblyPart assemblyPart = (AssemblyPart) part;
            price += assemblyPart.getPrice();
            for(ElectricPart subPart : assemblyPart.getParts()){
                price += subPart.getPrice();
            }
        }else{
            price += part.getPrice();
        }
        return price;
    }
}
