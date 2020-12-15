package com.chethan.designpatterns.creational.builder.loanapp;

// StringBuilder, StringBuffer
public class LoanRequestClient {
    public static void main(String[] args) {
        try {
            // Using startBuilding
            LoanRequest loanRequest = LoanRequest.startBuilding().setName("Chethan").setType(LoanRequest.ApplicantType.INDIVIDUAL).setAge(29)
                    .setCibilScore(423).setSalary(100).setLoanAmount(123).build();
            System.out.println(loanRequest);

            // Using new static class
            loanRequest = new LoanRequest.LoanRequestBuilder().setName("Chethan").setType(LoanRequest.ApplicantType.GOVT).setAge(29)
                    .setSalary(100).setLoanAmount(423).build();
            System.out.println(loanRequest);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
