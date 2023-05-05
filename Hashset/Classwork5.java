package Hashset;

import java.util.HashSet;

public class Classwork5 {
    public static void main(String[] args) {
        HashSet<String>device=new HashSet<String>();
        device.add("phone");
        device.add("tv");
        device.add("laptop");
        device.add("headphone");
        device.add("speaker");
        HashSet<String>device2=new HashSet<String>();
        device2.add("radio");
        device2.add("remote");
        device2.add("laptop");
        device2.add("headset");
        device2.add("speaker");
        System.out.println(device);
        System.out.println(device2);
        device2.retainAll(device);
        System.out.println("same things present are:"+device2);
    }
}
