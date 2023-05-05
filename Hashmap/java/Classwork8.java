package Hashmap.java;

import java.util.HashMap;

public class Classwork8 {
    public static void main(String[] args) {
        HashMap<Integer,Character>letter=new HashMap<Integer,Character>();
        letter.put(1,'a');
        letter.put(2,'b');
        letter.put(3,'c');
        letter.put(4,'d');
        letter.put(5,'e');
        System.out.println(letter);
        Boolean result=letter.containsValue('l');
        Boolean result2=letter.containsKey(5);
        System.out.println("the value is:"+result);
        System.out.println("the key is:"+result2);
    }
}
