package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
//    private void greet2(){
//        System.out.println("Good Morning");
//    }
    default void record4KVideo2(){
       //greet2();
        System.out.println("Recording in 4k video");
    }
}
interface MyWifi{
    String[]getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting to other ....");
    }
}
class MySmartPhone2 extends MyCellPhone implements MyWifi,MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }


    public void recordVideo() {
        System.out.println("RecordVideo...");
    }


    public String[] getNetwork() {
        System.out.println("Getting List of Network");
        String[]NetworkList={"Saud","Asif","Aman"};
        return NetworkList;
    }


    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }


//    public void record4KVideo() {
//        System.out.println("Taking Video in 4K ");
//    }
}
public class ch_11_Polymorphism_interface {
    public static void main(String[] args) {
         MyCamera c=  new MySmartPhone2();// This is SmartPhone but use only camera
         //c.getNetwork(); --> This is not allowed
         c.record4KVideo2();
         MySmartPhone2 ms=new MySmartPhone2();
         ms.connectToNetwork(" Jio 5G");
        String[]ar= ms.getNetwork();
        for (String item: ar
             ) {
            System.out.println(item);
        }
         // ms obj is called above all Method
    }
}
