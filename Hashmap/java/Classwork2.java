package Hashmap.java;

import java.util.HashMap;

public class Classwork2 {
    public static void main(String[] args) {
        HashMap<String,Integer>bike=new HashMap<String,Integer>();
        bike.put("ktm",12000);
        bike.put("re",15000);
        bike.put("r15",17000);
        bike.put("scooty",10000);
        bike.put("mt15",200000);
        System.out.println(bike.size());
    }
}
