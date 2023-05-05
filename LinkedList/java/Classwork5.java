package LinkedList.java;

import java.util.Collections;
import java.util.LinkedList;

public class Classwork5 {
    public static void main(String[] args) {
        LinkedList<Integer>num=new LinkedList<Integer>();
        num.add(100);
        num.add(543);
        num.add(678);
        num.add(213);
        num.add(789);
        System.out.println(num);
        Collections.shuffle(num);
        System.out.println("shuffle number is:"+num);
    }
}
