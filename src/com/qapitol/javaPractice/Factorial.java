package com.qapitol.javaPractice;

import java.util.Scanner;

public class Factorial {
    public static void factorial(int num){
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of number is: "+factorial);

    }
    public static void main(String artgs[]){
        System.out.println("Factorial number");
        System.out.println("enter the number to find out the facorial");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Factorial.factorial(number);
    }
}
