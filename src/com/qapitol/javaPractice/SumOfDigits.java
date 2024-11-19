package com.qapitol.javaPractice;

import java.util.Scanner;

public class SumOfDigits {

    public static void sunOfDigits(int number){
        int sum=0; int rem=0;
        while(number>0){
            rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        System.out.println("The sun of the digits of the number is= "+sum);
    }
    public static void main(String args[]){
        System.out.println("Caluculate the sum of the digits");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to caluculate the sum of the digits of the number");
        int number=sc.nextInt();
        SumOfDigits.sunOfDigits(number);
    }
}
