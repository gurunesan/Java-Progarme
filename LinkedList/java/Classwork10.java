package LinkedList.java;
import java.util.Collections;
import java.util.LinkedList;

public class Classwork10 {
    public static void main(String[] args) {
        LinkedList<Integer>mynum=new LinkedList<Integer>();
        mynum.add(323);
        mynum.add(234);
        mynum.add(9087);
        mynum.add(6578);
        mynum.add(12344);
        Collections.sort(mynum);
        System.out.println(mynum);
        mynum.set(0,5445);
        System.out.println(mynum);
    }
}
