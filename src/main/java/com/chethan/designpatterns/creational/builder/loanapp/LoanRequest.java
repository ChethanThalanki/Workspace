package com.chethan.designpatterns.creational.builder.loanapp;

public class LoanRequest {
    private String name;
    private ApplicantType type;
    private int age;
    private int cibilScore; // mandatory for loan request from INDIVIDUAL
    private int salary;
    private int loanAmount; // loanAmount <= salary * 3

    private LoanRequestBuilder loanRequestBuilder;

    public LoanRequest(LoanRequestBuilder loanRequestBuilder) {
        name = loanRequestBuilder.name;
        type = loanRequestBuilder.type;
        age = loanRequestBuilder.age;
        cibilScore = loanRequestBuilder.cibilScore;
        salary = loanRequestBuilder.salary;
        loanAmount = loanRequestBuilder.loanAmount;
    }

    public String getName() {
        return name;
    }

    public ApplicantType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public int getSalary() {
        return salary;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public static class LoanRequestBuilder{
        private String name;
        private ApplicantType type;
        private int age;
        private int cibilScore; // mandatory for loan request from INDIVIDUAL
        private int salary;
        private int loanAmount; // loanAmount <= salary * 3

        public LoanRequestBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LoanRequestBuilder setType(ApplicantType type) {
            this.type = type;
            return this;
        }

        public LoanRequestBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public LoanRequestBuilder setCibilScore(int cibilScore) {
            this.cibilScore = cibilScore;
            return this;
        }

        public LoanRequestBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public LoanRequestBuilder setLoanAmount(int loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }

        public LoanRequest build() throws Exception {
            if(ApplicantType.INDIVIDUAL.equals(type) && cibilScore == 0){
                throw new Exception("Rejected: Cibil score is compulsary for requests of type individual");
            }else if((float)loanAmount / salary > 3){
                System.out.printf("Loan amount limit exceeded limit of 3 times - %.2f \n", (float)loanAmount / salary);
                throw new Exception("Rejected: Loan amount limit exceeded");
            }
            System.out.println("Loan Approved!!");
            return new LoanRequest(this);
        }

    }

    public static LoanRequestBuilder startBuilding(){
        return new LoanRequestBuilder();
    }

    @Override
    public String toString() {
        return "LoanRequest Details{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", cibilScore=" + cibilScore +
                ", salary=" + salary +
                ", loanAmount=" + loanAmount +
                '}';
    }

    public enum ApplicantType {
        INDIVIDUAL, CORPORATE, GOVT
    }
}


