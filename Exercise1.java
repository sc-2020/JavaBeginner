package com.company;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total: ");
        float total = sc.nextFloat();
        float sub1, sub2, sub3, sub4, sub5;
        System.out.print("Enter marks of 5 subjects: ");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
//        float average = sum/total;
//        System.out.println("Average is: " + average);
        float percentage = sum/(total*5)*100;
        System.out.println("Percentage is: " + percentage);
    }
}
