package com.chethan.designpatterns.structural.facade.model;

public class ReportData {
    private String data;

    public ReportData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReportData{" +
                "data='" + data + '\'' +
                '}';
    }
}
