package LinkedList.java;
import java.util.Iterator;
import java.util.LinkedList;

public class Classwork2 {
    public static void main(String[] args) {
        LinkedList<String>bike=new LinkedList<String>();
        bike.add("mt15");
        bike.add("hero");
        bike.add("re");
        bike.add("scooty");
        bike.add("r15");
        Iterator<String> itr= bike.iterator();
        while(itr.hasNext()){  // in Iterator we print the output by while loop by using of Iterator "object.hasNext()" and print statement "object.next()".
            System.out.println(itr.next());
        }
    }
}
