package com.qapitol.javaPractice;

import java.util.Scanner;

public class Multiplication {
    public static void multiplcation(int num){
        for(int i=1;i<=num;i++){
            System.out.println("Multiplcation table for "+i);
           for(int j=1;j<=10;j++){
               System.out.println(i+"*"+j+"="+(i*j));
           }
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the range(n) to generate mulplication of table");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a range number");
        int range=sc.nextInt();
        Multiplication.multiplcation(range);
    }
}
