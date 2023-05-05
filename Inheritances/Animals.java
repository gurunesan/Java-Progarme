package Inheritances;

public class Animals {
    String name;
    int legs;
    void dis(){
        System.out.println(name);
        System.out.println(legs);
    }
}class dog extends Animals{
    String dname;
    int dlegs;
    void show(){
        System.out.println(name);
        System.out.println(legs);
    }

    public static void main(String[] args) {
        dog d=new dog();
        d.name="lion";
        d.legs=4;
        d.dname="dog";
        d.dlegs=4;
        d.dis();
        d.show();
    }
}
