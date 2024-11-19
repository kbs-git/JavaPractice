package com.qapitol.assignments;

public class Teacher extends Person{
     String subjectTeacher;
    double salary;

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("The Teacher Deatails is: "+"\nID = "+getId()+"\nName = "+getName()+"\nAge = "+getAge()+"\nSubject = " +getSubjectTeacher()+"\nsalary = "+getSalary());
    }
}
