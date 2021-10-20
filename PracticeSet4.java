package com.company;
import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
//        byte m1, m2, m3;
//        System.out.print("Enter your 3 subject marks: ");
//        Scanner sc = new Scanner(System.in);
//        m1 = sc.nextByte();
//        m2 = sc.nextByte();
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations! You have been promoted.");
//        }
//        else{
//            System.out.println("Please try again! ");
//        }


//        Question 3
//        Scanner sc = new Scanner(System.in);
//
//        float income;
//        income = sc.nextFloat();
//        float tax = 0f;
//        if(income < 2.5f)
//            tax = tax + 0;
//
//        else if(income >=2.5f && income < 5.0f)
//            tax += ((income-2.5)*0.05f);
//
//        else if(income >=5.0f && income < 10.0f)
//        {
//            tax += ((5.0f - 2.5f)*0.05f);
//            tax += ((income-5.0f)*0.2f);
//        }
//        else if(income>=10.0){
//            tax += ((5.0f - 2.5f)*0.05f);
//            tax += ((10.0f - 5.0f)*0.2f);
//            tax+= (income-10.0f)*0.3f;
//        }
//        System.out.println("Total tax paid is: " + tax);

//        Question 4
//        int day;
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch(day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//
//        }
        String url;
        Scanner sc = new Scanner(System.in);
        url = sc.next();
        if(url.endsWith(".com"))
            System.out.println("Commercial website");
        else if(url.endsWith(".org"))
            System.out.println("Organizational website");
        else if(url.endsWith(".in"))
            System.out.println("Indian website website");

    }
}
