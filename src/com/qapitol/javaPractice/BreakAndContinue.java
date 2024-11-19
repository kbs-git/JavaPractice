package com.qapitol.javaPractice;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                continue;
            }
            if(i>20){
                break;
            }
            System.out.println();

        }

    }
}
