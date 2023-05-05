package Arraylist.java;

import java.util.ArrayList;
import java.util.Collections;
                                          //shuffle and reverse a program use "Collection.shuffle","Collection.reverse"
public class Classwork7 {
    public static void main(String[] args) {
        ArrayList<String>animal=new ArrayList<String>();
        animal.add("dog");
        animal.add("cow");
        animal.add("bird");
        animal.add("cat");
        Collections.reverse(animal);
        System.out.println(animal);
        Collections.shuffle(animal);
        System.out.println(animal);
    }
}
