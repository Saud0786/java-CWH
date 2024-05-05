package com.company;
import java.util.Scanner;
public class ch_7_methods{
    static void multi(int n){

    for (int i=1;i<=10;i++){
        System.out.printf("%d X %d=%d \n",n,i,n*i);
    }
}
static void pattern(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

}
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int fib(int n) {
         if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        multi(6);
        pattern(7);
        pattern1(7);
        int result=fib(8);
        System.out.println(result);
    }

}