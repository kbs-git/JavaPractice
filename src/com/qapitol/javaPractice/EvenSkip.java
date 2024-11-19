package com.qapitol.javaPractice;

import java.util.Scanner;

public class EvenSkip {
    public static void evenSkip(int num){
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                if(i>=20){
                    continue;
                }
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        System.out.println("Skip the even numbers and stop the loop when the number is greater than 20 using continue");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number range");
        int num=sc.nextInt();
        EvenSkip.evenSkip(num);

    }
}
