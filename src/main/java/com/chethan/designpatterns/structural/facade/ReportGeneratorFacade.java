package com.chethan.designpatterns.structural.facade;

import com.chethan.designpatterns.structural.facade.model.Report;
import com.chethan.designpatterns.structural.facade.model.ReportData;
import com.chethan.designpatterns.structural.facade.model.ReportFooter;
import com.chethan.designpatterns.structural.facade.model.ReportHeader;
import com.chethan.designpatterns.structural.facade.model.ReportType;

public class ReportGeneratorFacade {

    public static void generateReport(ReportType type, String data, String location){
        Report report = new Report();

        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());

        report.setData(new ReportData(data));
        writeReport(type, report, location);
    }

    private static void writeReport(ReportType type,Report report, String location){
        switch (type){
            case CSV:
                System.out.println("CSV Report writing to location"+report+"===="+location);break;
            case PDF:System.out.println("PDF Report writing to location"+report+"===="+location);break;
            case HTML:System.out.println("HTML Report writing to location"+report+"===="+location);
            default:
        }
    }
}
