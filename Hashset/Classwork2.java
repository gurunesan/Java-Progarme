package Hashset;

import java.util.HashSet;

public class Classwork2 {
    public static void main(String[] args) {
        HashSet<String>bike=new HashSet<String>();
        bike.add("mt15");
        bike.add("re");
        bike.add("hero");
        bike.add("r15");
        bike.add("scooty");
        for(String i:bike){
            System.out.println(i);
        }
    }
}
