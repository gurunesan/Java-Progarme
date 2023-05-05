package Treeset.java;

import java.util.TreeSet;

public class Classwork2 {
    public static void main(String[] args) {
        TreeSet<String>car=new TreeSet<String>();
        car.add("benz");
        car.add("audi");
        car.add("kia");
       TreeSet<String>car2=new TreeSet<String>();
        car2.add("scorpio");
        car2.add("thar");
        car2.add("bmw");
        TreeSet<String>car3=new TreeSet<String>();
        car3.addAll(car);
        car3.addAll(car2);
        System.out.println(car);
        System.out.println(car2);
        System.out.println("All are added:"+car3);
    }
}
