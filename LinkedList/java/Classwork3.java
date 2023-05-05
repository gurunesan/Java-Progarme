package LinkedList.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Classwork3 {
    public static void main(String[] args) {
        LinkedList<String>fruit=new LinkedList<String>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("pineapple");
        fruit.add("grapes");
        fruit.add("banana");
        Iterator<String> itr=  fruit.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
