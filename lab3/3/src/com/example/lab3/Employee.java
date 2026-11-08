package com.example.lab3;

public class Employee {
    private String fullname;
    private Double salary;

    public Employee (String fullname, Double salary){
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {return fullname;}
    public Double getSalary (){return salary;}

}
