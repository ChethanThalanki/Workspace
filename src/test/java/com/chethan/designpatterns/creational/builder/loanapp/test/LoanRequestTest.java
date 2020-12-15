package com.chethan.designpatterns.creational.builder.loanapp.test;

import com.chethan.designpatterns.creational.builder.loanapp.LoanRequest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class LoanRequestTest {
    private String name;
    private LoanRequest.ApplicantType type;
    private int age;
    private int cibilScore; // mandatory for loan request from INDIVIDUAL
    private int salary;
    private int loanAmount; // loanAmount <= salary * 3

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll init() method called");
    }

    @BeforeEach
    public void initialize(){
        System.out.println("Before Each initialize() method called");
        name = "Chethan";
        type = LoanRequest.ApplicantType.INDIVIDUAL;
        age = 29;
        cibilScore = 423;
        salary = 100;
        loanAmount = 300;
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @Test
    @DisplayName("Individual Success Test")
    @RepeatedTest(1)
    public void individualSuccess() throws Exception {
        LoanRequest loanRequest = LoanRequest.startBuilding().setName(name).setType(type).setAge(age)
                .setCibilScore(cibilScore).setSalary(salary).setLoanAmount(loanAmount).build();
        Assertions.assertEquals(loanRequest.getCibilScore(), cibilScore, "Test passed");
    }

    @Test
    @DisplayName("Individual CIBIL Failure")
    public void individualFailure() {
        Assertions.assertThrows(Exception.class, () -> LoanRequest.startBuilding().setName(name).setType(type).setAge(age)
                .setCibilScore(cibilScore).setSalary(salary).setLoanAmount(loanAmount+120).build());
    }

    @Test
    public void govtSuccess() throws Exception{
        setType(LoanRequest.ApplicantType.GOVT);
        LoanRequest loanRequest = new LoanRequest.LoanRequestBuilder().setName(name).setType(type).setAge(age)
                .setSalary(salary).setLoanAmount(loanAmount).build();
        Assertions.assertNotNull(loanRequest);
    }

    @Test
    @Disabled("Do not run")
    public void disabledTest() throws Exception{
        throw new Exception("Do not run");
    }

    public void setType(LoanRequest.ApplicantType type) {
        this.type = type;
    }
}
