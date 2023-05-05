package Hashmap.java;


import java.util.HashMap;

public class Classwork6 {
    public static void main(String[] args) {
        HashMap<String,Integer>colours=new HashMap<String,Integer>();
        colours.put("red",1);
        colours.put("orange",2);
        colours.put("green",3);
        colours.put("purple",4);
        colours.put("black",5);
        Boolean result=colours.isEmpty();
        System.out.println(result);
    }
}
