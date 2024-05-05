package com.company;
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k video");
    }
}
interface Wifi{
    String[]getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting to other ....");
    }
}
class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("RecordVideo...");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting List of Network");
        String[]NetworkList={"Saud","Asif","Aman"};
        return NetworkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }


//    public void record4KVideo() {
//        System.out.println("Taking Video in 4K ");
//    }
}
public class ch_11_defaultMethods {
    public static void main(String[] args) {
        MySmartPhone cp=new MySmartPhone();
        String[]ar=cp.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
       cp.takeSnap();
        cp.recordVideo();
        cp.callNumber(766796122);
        cp.connectToNetwork("jio 5G");
        cp.pickCall();
        cp.record4KVideo();


    }
}
