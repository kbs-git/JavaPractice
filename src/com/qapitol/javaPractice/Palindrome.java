package com.qapitol.javaPractice;

import java.util.Scanner;

public class Palindrome {

    public static void stringPalindrome(String str){
        String actual=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(actual.equals(rev)){
            System.out.println("The given "+actual+" String is Plaindrome");
        }else{
            System.out.println("The given "+actual+" String is not Plaindrome");
        }
    }

    public static void numberPalinderome(int number){
        int actualNum=number;
            int rem=0;int sum=0;
            while(number>0){
                rem=number%10;
                sum=(sum*10)+rem;
                number=number/10;
            }
        if(actualNum==sum){
            System.out.println("The given "+actualNum+" num is Plaindrome");
        }else{
            System.out.println("The given "+actualNum+" num is not Plaindrome");
        }
    }

    public static void main(String args[]){
        System.out.println("The check the number and given string is palindrome or not");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to check is palindrome or not= ");
        String str=sc.next();
        System.out.print("Enter a number to check is palindrome or not= ");
        int number=sc.nextInt();
        Palindrome.stringPalindrome(str);
        Palindrome.numberPalinderome(number);
    }
}
