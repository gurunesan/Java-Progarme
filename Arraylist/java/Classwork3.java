package Arraylist.java;

import java.util.ArrayList;
import java.util.Collections;

public class Classwork3 {
    public static void main(String[] args) {
        ArrayList<String>colour=new ArrayList<String>();
        colour.add("pink");
        colour.add("green");
        colour.add("black");
        colour.add("brown");
        Collections.swap(colour,1,3);  // this is a syntax to swap a list by use of "Collection.swap".
        System.out.println(colour);
       Collections.sort(colour);
        System.out.println(colour);
        System.out.println(colour.get(2));
    }
}
