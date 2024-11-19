package com.qapitol.javaPractice;

import java.util.Scanner;

public class AreaOfRectangle {
    public void areaOfRecatngle(int length, int widgth){
        int areaofrectangle=length * widgth;
        System.out.println("Area of Reactangle is= "+areaofrectangle);
    }

    public static void main(String args[]){
        System.out.println("Caluclate the Area of rectangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a length");
        int length=sc.nextInt();
        System.out.println("Please enter a widgth");
        int width=sc.nextInt();
        AreaOfRectangle areaOfRectangle=new AreaOfRectangle();
        areaOfRectangle.areaOfRecatngle(length,width);
    }
}
