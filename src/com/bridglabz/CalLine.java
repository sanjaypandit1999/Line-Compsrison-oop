package com.bridglabz;

import java.util.Scanner;

public class CalLine {
    /**
     * Calculate length of line
     *
     * @author Sanjay
     * @version 1.1
     * @since 16-08-2021
     * @return
     */
    public double calLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x1 ");
        int X1 = sc.nextInt();
        System.out.println("enter the Y1 ");
        int Y1 = sc.nextInt();
        System.out.println("enter the x2 ");
        int X2 = sc.nextInt();
        System.out.println("enter the y2 ");
        int y2 = sc.nextInt();
        int X = X2 - X1;
        int Y = y2 - Y1;
        //calculate the length of line
        double length = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        System.out.println("Length of Line-" + length);
        return length;
    }
}
