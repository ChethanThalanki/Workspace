package com.chethan.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AssemblyPart extends ElectricPart{
    private List<ElectricPart> parts = new ArrayList<>();

    public void addPart(ElectricPart piece){
        parts.add(piece);
    }

    public List<ElectricPart> getParts() {
        return parts;
    }

    public void setParts(List<ElectricPart> parts) {
        this.parts = parts;
    }

    @Override
    public float getPrice() {
        return 10;
    }
}
