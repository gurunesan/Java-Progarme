package LinkedList.java;

import java.util.LinkedList;

public class Classwork4 {
    public static void main(String[] args) {
        LinkedList<String>device=new LinkedList<String>();
        device.add("phone");
        device.add("tv");
        device.add("radio");
        device.add("fan");
        device.add("ligth");
        System.out.println(device);
        device.addFirst("switch");
        device.addLast("charger");
        System.out.println(device);
        System.out.println(device.get(0));
        System.out.println(device.get(4));
    }
}
