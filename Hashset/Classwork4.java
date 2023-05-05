package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Classwork4 {
    public static void main(String[] args) {
        HashSet<String>veg=new HashSet<String>();
        veg.add("carrot");
        veg.add("tomato");
        veg.add("potato");
        veg.add("chilli");
        veg.add("onion");
        System.out.println(veg);
        ArrayList<String>arrl=new ArrayList<String>(veg);
        System.out.println(arrl);
    }
}
