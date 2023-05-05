package Hashmap.java;

import java.util.HashMap;

public class Classwork7 {
    public static void main(String[] args) {
        HashMap<String,Integer>veg=new HashMap<String,Integer>();
        veg.put("potato",1);
        veg.put("tomato",2);
        veg.put("carrot",3);
        veg.put("benes",4);
        veg.put("onion",5);
        System.out.println(veg);
        System.out.println(veg.clone());

    }
}
