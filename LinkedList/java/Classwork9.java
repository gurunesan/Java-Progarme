package LinkedList.java;

import java.util.LinkedList;

public class Classwork9 {
    public static void main(String[] args) {
        LinkedList<Character>type=new LinkedList<Character>();
        type.add('q');
        type.add('w');
        type.add('e');
        type.add('r');
        type.add('t');
        LinkedList<Character>type2=new LinkedList<Character>();
        type2.add('q');
        type2.add('w');
        type2.add('c');
        type2.add('r');
        type2.add('b');
        LinkedList<Character> type3=new LinkedList<Character>();
        for(Character i:type) {
            type3.add(type2.contains(i) ? 'y' : 'n');
        }
        System.out.println(type3);
    }
}
