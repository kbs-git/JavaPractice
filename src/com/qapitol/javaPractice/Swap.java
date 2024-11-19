package com.qapitol.javaPractice;

public class Swap {
    public static void swap(int num1, int num2){
        num1=num1+num2;// 50=20+30
        num2=num1-num2;// 20=50-30
        num1=num1-num2;// 30=50-20
        System.out.println("After swapping number1 is="+num1+" number2 is="+num2 );
    }
    public static void main(String args[]){
        int a=20;
        int b=30;
        System.out.println("Before swapping number1 is="+a+" number2 is="+b );
        Swap.swap(a, b);

    }
}
