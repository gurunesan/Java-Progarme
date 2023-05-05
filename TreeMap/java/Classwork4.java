package TreeMap.java;

import java.util.Scanner;
import java.util.TreeMap;

public class Classwork4 {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter firstname and lastname");
        TreeMap<String,String>name=new TreeMap<String,String>();
        name.put(obj1.next(), obj1.next());
        name.put(obj1.next(), obj1.next());
        System.out.println(name.entrySet());
    }
}
