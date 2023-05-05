package TreeMap.java;

import java.util.TreeMap;

public class Classwork3 {
    public static void main(String[] args) {
        TreeMap<String,Integer>colour=new TreeMap<String,Integer>();
        colour.put("red",1);
        colour.put("orange",2);
        colour.put("green",3);
        colour.put("purple",4);
        colour.put("white",5);
        System.out.println(colour);
        TreeMap<String,Integer>colour2=new TreeMap<String,Integer>();
        colour2.put("black",6);
        colour2.put("yellow",7);
        colour2.putAll(colour);
        System.out.println(colour2);
    }
}
