package com.company;

class Cylinder{
   protected    int radius;
   protected    int height;
public Cylinder(int height,int radius){
    this.height=height;
    this.radius=radius;
}

    public int getHeight() {
        return height;
    }
    public int setHeight(int height){
       this. height=height;

        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    public double sphereArea(){
        return 4*3.14*radius*radius;
    }
    public double sphereVolume(){
        return 4/3*3.14*radius*radius*radius;
    }

}
public class ch_9_practice {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(4,7);
      //  Rectangle r=new Rectangle();
       // c.setHeight(6);
      //  c.setRadius(3);
       // System.out.println(c.getHeight());
       // System.out.println(c.getRadius());
        System.out.println("Cylinder surfaceArea and volume");
        System.out.println(c.volume());
        System.out.println(c.surfaceArea());
        //System.out.println("Sphere surfaceArea and volume");
       // System.out.println(c.sphereArea());
      //  System.out.println(c.sphereVolume());

    }
}
