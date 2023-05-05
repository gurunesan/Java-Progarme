package Arraylist.java;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String>Bike=new LinkedList<String>();
        Bike.add("RE");
        Bike.add("MT");
        Bike.add("dio");
        Bike.add("ktm");
        Bike.addFirst("r15");
        Bike.addLast("hero");
        Collections.sort(Bike);
        System.out.println(Bike.get(0));
        for(String i:Bike){
            System.out.println(i);
        }
    }
}
