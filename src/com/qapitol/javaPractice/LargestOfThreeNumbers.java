package com.qapitol.javaPractice;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void findLargestNumber(int num1, int num2, int num3){
        int largest;
        /*if(num1>num2 && num1>num3){
            largest=num1;
        }else if(num2>num1&&num2>num3){
            largest=num2;
        }else{
            largest=num3;
        }*/
       largest=Math.max(num1,Math.max(num2,num3));
        System.out.println("the Lrgest of 3 numbers is= "+largest);
    }
    public static void main(String args[]){
        System.out.println("Find out the largest of 3 numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 numbers to check the largest of 3 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        LargestOfThreeNumbers.findLargestNumber(num1,num2,num3);
    }
}
