package com.chethan.designpatterns.structural.facade.model;

public class Report {
    private ReportHeader header;
    private ReportFooter footer;
    private ReportData data;

    public void setHeader(ReportHeader header) {
        System.out.println("Setting report header");
        this.header = header;
    }

    public void setFooter(ReportFooter footer) {
        System.out.println("Setting report footer");
        this.footer = footer;
    }

    public void setData(ReportData data) {
        System.out.println("Setting report data");
        this.data = data;
    }

    public ReportHeader getHeader() {
        return header;
    }

    public ReportFooter getFooter() {
        return footer;
    }

    public ReportData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Report{" +
                "header=" + header +
                ", footer=" + footer +
                ", data=" + data +
                '}';
    }
}
