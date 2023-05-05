package Arraylist.java;

import java.util.ArrayList;

public class Classwork5 {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<String>();
        car.add("bmw");
        car.add("benz");
        car.add("honda");
        car.add("audi");
        if(car.contains("benz")){
            System.out.println("benz is present");
        }else{
            System.out.println("benz is not found");
        }
    }
}
