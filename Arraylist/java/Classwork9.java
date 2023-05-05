package Arraylist.java;
import java.util.Scanner;
import java.util.ArrayList;

public class Classwork9 {
    public static void main(String[] args) {
       Scanner object1=new Scanner(System.in);
        System.out.println("enter names");
        String a[]= new String[5];
        ArrayList<String>name=new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            name.add(object1.nextLine());
        }
        System.out.println(name);
    }
}
