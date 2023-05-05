package Treeset.java;


import java.util.TreeSet;

public class Classwork6 {
    public static void main(String[] args) {
        TreeSet<Integer>no=new TreeSet<Integer>();
        TreeSet<Integer>it=new TreeSet<Integer>();
        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);
        no.add(6);
        no.add(7);
        no.add(8);
        System.out.println(no);
      it=new TreeSet<Integer>(no.headSet(7));
        System.out.println(it);
    }
}
