package com.company;
import java.util.Scanner;

public class KmsToMiles {
    public static void main(String[] args) {
        float km = 45623.5f;
        float miles = km*0.621f;
        System.out.println(miles);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        System.out.println(sc.hasNextInt());
    }
}
