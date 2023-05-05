package Treeset.java;

import java.util.TreeSet;

public class Classwork1 {
    public static void main(String[] args) {
        TreeSet<String>colour=new TreeSet<String>();
        colour.add("red");
        colour.add("blue");
        colour.add("green");
        colour.add("yellow");
        colour.add("pink");
        System.out.println(colour);
        for(String i:colour){
            System.out.println(i);
        }
    }
}
