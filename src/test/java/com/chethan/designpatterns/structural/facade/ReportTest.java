package com.chethan.designpatterns.structural.facade;

import com.chethan.designpatterns.structural.facade.model.ReportType;
import org.junit.jupiter.api.Test;

// JDBCConnection
public class ReportTest {
    @Test
    void generateCSVReport(){
        ReportGeneratorFacade.generateReport(ReportType.CSV, "Test", "/usr/local");
    }
}
