package TreeMap.java;

import java.util.TreeMap;

public class Classwork2 {
    public static void main(String[] args) {
        TreeMap<String,Integer>fruit=new TreeMap<String,Integer>();
        fruit.put("apple",1);
        fruit.put("orange",2);
        fruit.put("grapes",3);
        fruit.put("gova",4);
        fruit.put("watermelon",5);
        System.out.println(fruit);
        System.out.println("copied:"+fruit.clone());
    }
}
