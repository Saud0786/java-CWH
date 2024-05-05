package com.company;
import java.util.Scanner;
public class ch_5_loopControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Question-1
//        int n= sc.nextInt();
//        for (int i=0;i<n;i++){
//            for(int j=n;j>i;j--){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
         // Question-2
//        int n= sc.nextInt();
//        for (int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        // question -3
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum=sum+2*i;
//        }
//        System.out.println(sum);

        //Question -4
//        int n=sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d X %d=%d \n",n,i,n*i);
//        }
        //Question - 5
//        int n=sc.nextInt();
//
//        for (int i =10;i>=1;i--){
//            System.out.printf("%d X %d=%d \n",n,i,n*i);
//        }
        //Question -6
//        int fac=1;
//        int n= sc.nextInt();
//        for (int i=1;i<=n;i++){
//            fac*=i;
//        }
//        System.out.println(fac);
         //Question -7
        int n=8;
        int sum=0;
        for (int i=1;i<=10;i++){
            sum=sum+n*i;
        }
        System.out.println(sum);
    }
}
