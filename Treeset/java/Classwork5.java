package Treeset.java;


import java.util.TreeSet;

public class Classwork5 {
    public static void main(String[] args) {
        TreeSet<Integer>number=new TreeSet<Integer>();
        number.add(34);
        number.add(63);
        number.add(236576);
        number.add(147567);
        number.add(8970);
        System.out.println(number);
        TreeSet<Integer>num=new TreeSet<Integer>(number);
        System.out.println("cloned:"+num);

    }
}
