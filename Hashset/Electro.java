package Hashset;

import java.util.HashSet;

public class Electro {
    public static void main(String[] args) {
        HashSet<String>device=new HashSet<String>();
        device.add("fan");
        device.add("computer");
        device.add("phone");
        device.add("tv");
        System.out.println(device.contains("tv"));
        System.out.println(device.size());
        for(String i:device) {
            System.out.println(i);
        }
    }
}
