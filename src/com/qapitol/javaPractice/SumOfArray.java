package com.qapitol.javaPractice;

public class SumOfArray {
    public static void arraySum(int arr[]){
        int sum=0;
        for(int temp:arr){
            sum=sum+temp;
        }
        System.out.println("array of sum is= "+sum);
    }
    public static void main(String args[]){
        System.out.println("Sum of the array using for each loop");
        int[] arraysize={10,20,30,40,50};
        SumOfArray.arraySum(arraysize);

    }
}
