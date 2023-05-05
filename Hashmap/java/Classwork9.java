package Hashmap.java;

import java.util.HashMap;

public class Classwork9 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>num=new HashMap<Integer,Integer>();
        num.put(1,100);
        num.put(2,200);
        num.put(3,300);
        num.put(4,400);
        num.put(5,500);
        System.out.println("key and values:"+num.entrySet());
        System.out.println("key:"+num.keySet());
        System.out.println("values:"+num.values());
    }
}
