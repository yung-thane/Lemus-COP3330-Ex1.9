/*
 *  UCF COP3330 Fall 2021 Assignment 1.9 Solution
 *  Copyright 2021 Ronald Lemus
 */



import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){
        System.out.print("What is the length of the ceiling in feet? ");
        Scanner lengthInp = new Scanner(System.in);
        int length = lengthInp.nextInt();

        System.out.print("What is the width of the ceiling in feet? ");
        Scanner widthInp = new Scanner(System.in);
        int width = widthInp.nextInt();

        int ceilingArea = length * width;
        double gallonsNeeded =  Math.ceil(((double) ceilingArea) / 350);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.", gallonsNeeded,ceilingArea);


    }
}
