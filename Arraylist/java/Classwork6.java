package Arraylist.java;

import java.util.ArrayList;

public class Classwork6 {
    void show1(){
        ArrayList<String>veg=new ArrayList<String>();
        veg.add("tomato");
        veg.add("potato");
        veg.add("carrot");
        veg.add("ladiesfinger");
        veg.add("chilli");
        System.out.println(veg);
    }
}
class subclass extends Classwork6{

}
class complete{
    public static void main(String[] args) {
        subclass obj1=new subclass();
        obj1.show1();
    }
}