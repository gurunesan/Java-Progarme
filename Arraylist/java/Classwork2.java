package Arraylist.java;

import java.util.ArrayList;

public class Classwork2 {
    public static void main(String[] args) {
        ArrayList<String>fruit=new ArrayList<String>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("grapes");
        fruit.add("banana");
        System.out.println(fruit);
        fruit.set(2,"watermelon");
        System.out.println(fruit);
    }
}
