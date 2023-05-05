package Arraylist.java;

import java.util.ArrayList;

public class Classwork4 {
    public static void main(String[] args) {
        ArrayList<String>bike=new ArrayList<String>();
        bike.add("ktm");
        bike.add("re");
        bike.add("r15");
        bike.add("hero");
        bike.ensureCapacity(1);  //if we use "ensureCapacity" we create a new space to enter values.
        bike.add("scooty");
        System.out.println(bike.subList(0,2));   //finding a extract position indexof() or using "sublist"
bike.set(1,"mt15");
        System.out.println(bike);
    }
}
