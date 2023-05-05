package LinkedList.java;
import java.util.Collections;
import java.util.LinkedList;
public class Classwork1 {
    public static void main(String[] args) {
        LinkedList<String> car=new LinkedList<String>();
        car.add("thar");
        car.add("scorpio");
        car.add("kia");
        car.add("cvic");
        car.add("range rover");
        System.out.println(car);
        Collections.swap(car,4,2);
        System.out.println("swap the cars:"+car);
    }
}
