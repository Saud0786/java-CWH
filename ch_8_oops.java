package com.company;


    // Problem 1

import java.awt.*;
import java.awt.geom.Area;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
       return n;
    }
}

   //Problem 2

class CellPhone{
     public void ring(){
         System.out.println("Ringing");
     }
     public void vibrate(){
         System.out.println("Vibrating");
     }
     public void callFriend(){
         System.out.println("Call to Ashif.");
     }
}


      //Problem 3


class Square{
 int side;
 public int Area(){
     return side*side;
 }
 public int Perimeter(){
     return 4*side;
 }
}


 //        Problem 4


class rectangle{
    int length;
    int width;
    public int Area(){
        return length*width;
    }
    public int Perimeter(){
        return (length + width)*2;
    }
}


       // Problem 5
class TommyVecetti{

    public void hit(){
        System.out.println("Hitting to the enemy");
    }
    public void run(){
        System.out.println("Running to the enemy");
    }
    public void firing(){
        System.out.println("Firing to the enemy");
    }

       }



       // Problem 6


class Circle{
    double r;
    public double area(){
        return r*3.14;
    }
    public double perimeter(){
        return 2*r*3.14;
    }

}

public class ch_8_oops {
    public static void main(String[] args) {

        //problem 1

        Employee1 s=new Employee1();
        s.name="helllo saud";
        s.salary=232;
        System.out.println(s.getName());
        System.out.println(s.getSalary());
        System.out.println(s.setName("Ashif"));


        // problem 2
        CellPhone vivo=new CellPhone();
        vivo.ring();
        vivo.vibrate();
        vivo.callFriend();


        // Problem 3

      Square p=new Square();
      p.side=12;
        System.out.print("Area of Square =");
        System.out.println(p.Area());
        System.out.print("Perimeter of Square =");
        System.out.println(p.Perimeter());


        // Problem 4

        rectangle r=new rectangle();
        r.length=4;
        r.width=5;
        System.out.print("Area of Rectangle =");
        System.out.println(r.Area());
        System.out.print("Perimeter of Rectangle =");
        System.out.println(r.Perimeter());


        // Problem 5

        TommyVecetti player1=new TommyVecetti();
        player1.hit();
        player1.run();
        player1.firing();




        // Problem 6
        Circle c=new Circle();
        c.r=4.5;
        System.out.print("Area of Circle = ");
        System.out.println(c.area());
        System.out.print("Perimeter of Circle =");
        System.out.println(c.perimeter());

    }
}
