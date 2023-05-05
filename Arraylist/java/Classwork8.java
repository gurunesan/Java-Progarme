package Arraylist.java;

import java.util.ArrayList;

public class Classwork8 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("bike");
        list1.add("car");
        list1.add("furit");
        list1.add("bird");
        list1.add("number");

        ArrayList<String> list2=new ArrayList<String>();
        list2.add("bike");
        list2.add("car");
        list2.add("kjhg");
        list2.add("bird");
        list2.add("number");
        ArrayList<String> list3=new ArrayList<String>();
        //list3.addAll(list1);   //join list by using .addAll.
       // list3.addAll(list2);
       // System.out.println(list3);
        for(String i:list1)
             list3.add(list2.contains(i)?"yes":"no");  //in this type of comparing list in arraylist we contain and print boolean type(?"yes":"no")
        System.out.println(list3);

      }
    }
