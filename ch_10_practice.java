package com.company;

/*
class circle1{
    circle1(){
        System.out.println("i am circle constructor");
    }
    circle1(int r){

         radius=r;
    }

public int radius;

    public double Area(){
         return Math.PI*radius*radius;
     }
     public double Volume(){
         return 2*Math.PI*radius*radius;
     }
}
class Cylinder1 extends circle1{
    Cylinder1(int r,int h){
        //super();
        super(r);
        height=h;
    }
   public int height;
   public double AreaCylinder(){
       System.out.println("The Area of cylinder is");
       return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
   }
   public double VolumeCylinder(){
       System.out.println("The volume of cylinder is");
       return Math.PI*radius*radius*height;
   }
}
*/
class Rectangle2{
        int breath;
        int width;
     int length;
   /* public  Rectangle2(int a,int b,int c){

        width=a;
        breath=b;
        length=c;
        // return width;
    }*/
    public int getBreath() {
        return breath;
    }
    public int setBreath(int breath){
        this. breath=breath;

        return breath;
    }
    public int getWidth() {
        return width;
    }
    public int setWidth(int width){
        this. width=width;

        return width;
    }
    public int getLength() {
        return length;
    }
    public int setLength(int length){
        this.length=length;

        return length;
    }
    public int volumeRec(){
        return length*breath*width;
    }
    public int parameters(){
        return 2*(length+width);
    }
}

class cuboid extends Rectangle2{
    int height;
    int length;
    int width;
    int breath;

    @Override
    public int getBreath() {
        return breath;
    }

    @Override
    public int  setBreath(int breath) {
        this.breath = breath;
        return breath;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int setWidth(int width) {
        this.width = width;
        return width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int setLength(int length) {
        this.length = length;
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int areaOfCuboid(){
        return 2*length*width+2*width*height+2*height*length;
    }
    public int volumeOfCuboid(){
        return length*breath*height;
    }

}

public class ch_10_practice {
    public static void main(String[] args) {
       /* circle1 c=new circle1(3);
       // c.radius=34;
        Cylinder1 d=new Cylinder1(3,5);
        //d.height=3;
        System.out.println(d.AreaCylinder());
        System.out.println(d.VolumeCylinder());
        System.out.println("The volume of circle is");
        System.out.println(c.Volume());
        System.out.println("The Area of circle is");
        System.out.println(c.Area());*/
        Rectangle2 f=new Rectangle2();
        f.setBreath(4);
       // System.out.println(f.getBreath());
        f.setLength(3);
        f.setWidth(5);
        cuboid b=new cuboid();
        b.setHeight(7);
        b.setLength(4);
        b.setWidth(3);
        b.setBreath(6);
        System.out.println("volume of cuboid is "+b.volumeOfCuboid());
        System.out.println("area of cuboid is "+b.areaOfCuboid());
        System.out.println(" volume of rec "+f.volumeRec());
        System.out.println("area of rec "+f.parameters());


    }

}
