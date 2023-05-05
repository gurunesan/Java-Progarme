package Hashmap.java;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Classwork4 {
    public static void main(String[] args) {
        Scanner object1=new Scanner(System.in);
        System.out.println("enter name and number");
        String a[]=new String[5];
        HashMap<String,Long>det=new HashMap<String,Long>();
     for(int i=0;i<a.length;i++){
         det.put(object1.next(), object1.nextLong());
     }
        System.out.println(det);
    }

}
