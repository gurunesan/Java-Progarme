package Inheritances;

public class Bike { //this parent class or super class.
  public  String name1="RE";
   public int tyer1=2;
    void show(){
        System.out.println(name1);
        System.out.println(tyer1);
    }
}
class Bike2 extends Bike{  //this is child class or subclass("extends") is keyword for inheritance
    public  String name2="MT V3";
    public int tyer2=2;
    void disp(){
        System.out.println(name2);
        System.out.println(tyer2);
    }

    public static void main(String[] args) { ///now we create object for child class because it is inheritance.
        Bike2 obj=new Bike2();  //creating object for child class.
        obj.show();
        obj.disp();
    }
}
