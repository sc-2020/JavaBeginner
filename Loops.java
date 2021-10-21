package com.company;
public class Loops {
    public static void main(String[] args) {
//        int n = 6;
//        for(int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        int sum = 0, n = 3;
//        for (int i = 0; i < n; i++) {
//            sum += (2*i);
//        }
//        System.out.println("Sum is: " + sum);
//        int n = 3;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//        int n = 10;
//        for (int i = 10; i >= 1; i--) {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//        int n = 5, i = 1;
//        int fact = 1;
//        while(i <= n){
//            fact *= i;
//            i++;
//        }
//        System.out.println("Factorial is: " + fact);

        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (n*i);
        }
        System.out.println("Sum is: " + sum);
    }
}
