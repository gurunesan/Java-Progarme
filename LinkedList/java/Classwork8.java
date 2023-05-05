package LinkedList.java;

import java.util.LinkedList;

public class Classwork8 {
   void show2(){
        LinkedList<Integer>number=new LinkedList<Integer>();
        number.add(23);
        number.add(43);
        number.add(456);
        number.add(45445);
        number.add(1234);
       System.out.println(number);

    }
}
class subclass extends Classwork8{

}
class complete{
    public static void main(String[] args) {
        subclass obj1=new subclass();
       obj1.show2();
    }
}