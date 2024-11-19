package com.qapitol.javaPractice;

public class AmstrongNumber {
    public static void amstrongnumber(int start, int end){
        for(int i=start;i<=end;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int rem=temp%10;
                sum+=Math.pow(rem, 3);
                temp=temp/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        System.out.println("To find all the amstrong number between 1 to 1000");
        int start=1;
        int end=1000;
        amstrongnumber(start,end);
    }

}
