package Inheritances;



import java.util.Scanner;
public class Appl {
    String name;
    long number;
    int rank;
    public void scan(){
        Scanner object1=new Scanner(System.in);
        System.out.println("enter name");
        name= object1.next();
        System.out.println("enter number");
        number= object1.nextLong();
        System.out.println("enter rank");
        rank= object1.nextInt();
    }
}
class stut1 extends Appl{
    void show1(){
        System.out.println("your name is:"+name);
        System.out.println("your number is:"+number);
        System.out.println("your rank is:"+rank);
    }
}
class stut2 extends stut1{
    void show2(){
        System.out.println("your name is:"+name);
        System.out.println("your number is:"+number);
        System.out.println("your rank is:"+rank);
    }
}

