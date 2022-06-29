package com.Sharad;

import java.util.Date;

public class Employees {

    private String name;

    private double salary;

     private Date  date;

     public Employees(String name,double salary){
         this.name = name;
         this.salary = salary;

         date = new Date();

     }


     public String toString(){

         return name + " " + salary + " " + date.toString()+ "\n";
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

