package Hashset;

import java.util.HashSet;

public class Classwork3 {
    public static void main(String[] args) {
        HashSet<String>fruit=new HashSet<String>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("grapes");
        fruit.add("gova");
        fruit.add("custed apple");
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.clone());

    }
}
