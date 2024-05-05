package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors_game {
    public static void main(String[] args) {
        System.out.println("0 for scissors , 1 for paper ,2 for Rock");
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();

        Random rc=new Random();
        int computerInput=rc.nextInt(3);
        if(computerInput==userInput){
            System.out.println("Draw ");
        }
        else if(userInput==0 && computerInput==1 || userInput==1 && computerInput==2 || userInput==2 && computerInput==0 ){
            System.out.println("You win");
        }

        else{
            System.out.println("Computer win");
        }
        if(computerInput==0){
            System.out.println("computer input : scissor ");
        } else if (computerInput==1) {
            System.out.println("computer input : paper");
        } else if (computerInput==2) {
            System.out.println("computer input : rock");
        }
    }
}
