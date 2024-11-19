package com.qapitol.javaPractice;

public class PrimeNumbers {
    public static void primeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int num){
        if(num<=1){
           return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Printing all the prime numbers between 1 to 50");
        int start=1;
        int end=50;
        PrimeNumbers.primeNumbers(start,end);
    }
}
