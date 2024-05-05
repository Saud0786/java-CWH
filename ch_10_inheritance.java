package com.company;

class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int a){
        System.out.println("I am constructor with a valve = "+ a);
    }
    int x;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base
{
    Derived(){
        System.out.println("I am Derived constructor ");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("I am Derived constructor with value b= "+b);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Childhood extends Derived{
    Childhood(int a,int b,int c){
        super(a,b);
        System.out.println("I am Childhood constructor with valve c= "+ c);
    }
}
public class ch_10_inheritance {
    public static void main(String[] args) {
     Base b=new Derived();
      b.setX(4);
        System.out.println(b.getX());
     // b.setX(4);


      //  System.out.println(" Base x = "+b.getX());
       // Derived d=new Derived(2,5);
        // d.setX(56);
        //d.setY(43);
      //  System.out.println("Derived y= "+d.getY());
      //  System.out.println("derived x= "+d.getX());
    // Childhood c=new Childhood(5,7,9);
    }
}
