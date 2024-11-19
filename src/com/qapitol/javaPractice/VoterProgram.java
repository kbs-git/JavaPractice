package com.qapitol.javaPractice;

import java.util.Scanner;

public class VoterProgram {
    public static void voteingEligible(int age){
        if(age>=18 && age<100){
            System.out.println("the person is eligible for vote");
        }else if(age<18){
            System.out.println("the person is not eligible for vote");
        }else{
            System.out.println("the person is not eligible for vote");
        }
    }
    public static void main(String args[]){
        System.out.println("To check the person is eligible for voteing process");
        System.out.println("Enter the person age= ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        VoterProgram.voteingEligible(age);
    }
}
