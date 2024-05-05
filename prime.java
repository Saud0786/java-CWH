package com.company;

import java.util.Scanner;
class sum{
    String a;
    String b;

public void printSum(){
    String c=a+ " " +b;
    System.out.println("Sum of A And B ="+c);
}
}
public class prime {
    public static void main(String[] args) {
        sum s=new sum();
        s.a="saud";
        s.b="ansari";
       // System.out.println(s.a+s.b);
        //System.out.println(s.b);
        s.printSum();
    }
}