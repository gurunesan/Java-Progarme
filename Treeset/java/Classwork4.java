package Treeset.java;

import java.util.TreeSet;

public class Classwork4 {
    public static void main(String[] args) {
        TreeSet<String>bike=new TreeSet<String>();
        bike.add("ktm");
        bike.add("hero");
        bike.add("mt15");
        bike.add("r15");
        bike.add("scooty");
        System.out.println(bike);
        String first= bike.first();
        System.out.println(first);
        String last= bike.last();
        System.out.println(last);
    }
}
