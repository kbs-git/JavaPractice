package com.qapitol.javaPractice;

import java.util.Scanner;

public class Fibonacci {
    public static void fibbonacciSEries(int num){
        int n1=0; int n2=1;
        for(int i=0;i<num;i++){
            System.out.println(n1);
            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }
    }
    public static void main(String args[]){
        System.out.println("Fibonacci Sereis");
        System.out.println("enter the how many numbers serries you need");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Fibonacci.fibbonacciSEries(num);
    }
}
