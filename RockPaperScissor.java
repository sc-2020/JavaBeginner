package com.company;
import javax.management.relation.RelationNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Random r = new Random();

        int you=0, comp=0, i;
        for(i=1;  i<6; i++){
            System.out.println("---------------Round " + i + "---------------");
            System.out.println("Enter you choice: \n\t0. Rock\n\t1. Paper\n\t2. Scissor");
            int value = sc.nextInt();
            System.out.print("     You entered: ");
            switch(value){
                case 0-> System.out.println("Rock");
                case 1-> System.out.println("Paper");
                case 2-> System.out.println("Scissor");
            }
            int computer = r.nextInt(3);
            System.out.print("Computer entered: ");
            switch(computer){
                case 0-> System.out.println("Rock\n");
                case 1-> System.out.println("Paper\n");
                case 2-> System.out.println("Scissor\n");
            }
            switch(value){
                case 0 -> {
                    switch (computer) {
                        case 1 -> comp++;
                        case 2 -> you++;
                    }
                }
                case 1 -> {
                    switch (computer) {
                        case 0 -> you++;
                        case 2 -> comp++;
                    }
                }
                case 2 ->{
                    switch (computer) {
                        case 0 -> comp++;
                        case 1 -> you++;
                    }
                }
            }
            System.out.println("Scores:\nYour score: " + you + "\tComputer: " + comp);
            System.out.println("\n");
        }
        if(you > comp)
            System.out.println("You won!");
        else if(comp > you)
            System.out.println("Computer won!");
        else
            System.out.println("It's a draw.");
    }
}
