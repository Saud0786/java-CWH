package com.company;
import java.util.Scanner;
public class ch_4_conditionals {
    public static void main(String[] args) {
        //Question- 1
//        int a=11;
//        if(a==11){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }

        // Question -2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the num of eng :");
//        float eng=sc.nextInt();
//        System.out.println("Enter the num of hindi :");
//        float hindi=sc.nextInt();
//        System.out.println("Enter the num of math :");
//        float math=sc.nextInt();
//        double percentage= (eng+hindi+math)/300*100;
//        System.out.println("Percentage "+percentage+"%");
//        if(eng>=33 && hindi>=33 && math>=33){
//            System.out.println(" CONGRATULATION YOU ARE PASS");
//        }
//        else{
//            System.out.println("SORRY YOU ARE FAIL");
//        }

        //Question -3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your income:");
//        double tax=0;
//        double income=sc.nextFloat();
//        if(income<=2.5){
//            tax=tax+0;
//        }
//       else if(income>=2.5 &&income<=5.0){
//            tax=(tax+0.05)*(income-2.5);
//        } else if (income>=5.0 && income<=10.0) {
//            tax=(tax+0.05)*(5.0-2.5);
//            tax=(tax+0.2)*(income-5.0);
//        } else if (income>=10.0 ) {
//            tax=(tax+0.05)*(5.0-2.5);
//            tax=tax+0.2*(10.0-5.0);
//            tax=(tax+0.3)*(income-10.0);
//        }
//        System.out.println("Total tax paid by user "+tax);

        //Question -4
//        Scanner sc=new Scanner(System.in);
 //       System.out.println("enter you day");
//        int day=sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("MONDAY");
//                break;
//            case 2:
//                System.out.println("TUESDAY");
//                break;
//            case 3:
//                System.out.println("WEDNESDAY");
//                break;
//            case 4:
//                System.out.println("THURSDAY");
//                break;
//            case 5:
//                System.out.println("FRIDAY");
//                break;
//            case 6:
//                System.out.println("SATURDAY");
//                break;
//            case 7:
//                System.out.println("SUNDAY");
//                break;
//            default:
//                System.out.println("INVALID DAY");
//        }

        // Question -5
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter you year");
//        int year=sc.nextInt();
//        if(year%4==0 || year%400==0){
//            System.out.println("THIS IS LEAP YEAR");
//        }
//        else{
//            System.out.println("THIS IS NOT LEAP YEAR");
//        }

        //Question -6
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you web");
        String web=sc.next();
        if(web.endsWith(".com")){
            System.out.println("COMMERCIAL WEB");
        }
        if(web.endsWith(".org")){
            System.out.println("ORGANIZATION WEB");
        }
        if(web.endsWith(".in")){
            System.out.println("INDIAN WEB");
        }

    }
}
