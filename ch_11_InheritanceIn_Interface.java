package com.company;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface ChildOfSample extends sampleInterface{
    void meth3();
    void meth4();
}
class parentOfAllInterface{
    public void meth1(){
        System.out.println("This is Meth 1");
    }
    public void meth2(){
        System.out.println("This is Meth 2");
    }
    public void meth3(){
        System.out.println("This is Meth 3");
    }
    public void meth4(){
        System.out.println("This is Meth 4");
    }
}
public class ch_11_InheritanceIn_Interface {
    public static void main(String[] args) {
        parentOfAllInterface p=new parentOfAllInterface();
        p.meth1();
        p.meth2();
        p.meth3();
        p.meth4();
    }
}
