package LinkedList.java;

import java.util.LinkedList;

public class Classwork7 {
    public static void main(String[] args) {
        LinkedList<String>comp=new LinkedList<String>();
        comp.add("hp");
        comp.add("dell");
        comp.add("lenovo");
        comp.add("apple");
        comp.add("asus");
            if(comp.contains("lenovo")){
                System.out.println("present");
            }else{
                System.out.println(" not present");
            }
        }
    }

