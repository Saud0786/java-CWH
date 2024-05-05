package com.company;
 abstract class parent2{
    public parent2(){
        System.out.println("mai base 2 ka contractor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
     abstract public void greet2();
}
class child extends parent2{
     public void greet(){
         System.out.println("Good morning");
     }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }

}


 abstract class child3 extends parent2{
     public void th(){
         System.out.println("I am good");
     }
}
public class ch_11_abstraction {
    public static void main(String[] args) {
        child c=new child();
        c.greet();
        c.greet2();
        c.sayHello();
        System.out.println("child 3 ka constructor");


    }
}
