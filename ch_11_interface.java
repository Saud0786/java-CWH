package com.company;

interface Bicycle{
    int a= 43;
      void applyBrake(int decrement);
      void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn(int highVolume);
    void blowHornWithRing(int LowVolume);
}
class Avon implements Bicycle,HornBicycle{
    @Override
    public void speedUp(int increment) {
        System.out.println("Speed increase.....");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Brake apply......");
    }
    public void blowHorn(int highVolume){
        System.out.println("Poo poo poo ......");
    }
    public void blowHornWithRing(int lowVolume){
        System.out.println("tu mera hai sanam .... po po po" );
    }
}

public class ch_11_interface {
    public static void main(String[] args) {
        Avon C=new Avon();
        C.applyBrake(2);
        C.speedUp(4);
        // you cannot modify the properties of interface as they are final
        // C.a=23;
        System.out.println(C.a);
        C.blowHorn(6);
        C.blowHornWithRing(4);


    }
}
