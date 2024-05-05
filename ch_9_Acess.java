package com.company;
class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(){
        id=34;
        name="Aman";
    }
    public MyEmployee(int i,String c){
        id=i;
        name=c;
    }


   public int getId(){
       return id;
   }
    public int setId(int i) {
        this.id = i;
        return i;
    }
    public String getName(){
        return name;
    }
    public String setName(String n) {
        this.name = n;
        return n;
    }
}
public class ch_9_Acess {
    public static void main(String[] args) {
       MyEmployee m=new MyEmployee(56,"ashif");
       //m.setId(45);
        System.out.println(m.getId());

       // m.setName("saud");
        System.out.println(m.getName());

    }
}
