package com.qapitol.assignments;

public class Student extends Person{
     String cource;
     float marks;

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }


    public void caluculatorGrade(){
        if(marks>=75 || marks<=100){
            System.out.println("The Student Grade is A");
        }else if(marks>=50 && marks<=74){
            System.out.println("The Student Grade is B");
        }else{
            System.out.println("The Student Grade is C");
        }
    }

    @Override
    void displayDetails() {
        System.out.println("The Student Details is: "+"\nID = "+getId()+"\nName = "+getName()+"\nAge = "+getAge()+
                "\ncourse = " +getCource()+ "\nMarks = "+getMarks());
    }
}
