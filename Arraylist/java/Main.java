package Arraylist.java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<String>();
        cars.add("bmw");
        cars.add("kia");
        cars.add("thar");
        cars.add("honda civic");
  //  for(int i=0;i<cars.size();i++){
      //      System.out.println(cars.get(i));
   //    }
        cars.remove(0);
        cars.set(0,"benz");
        Collections.sort(cars);
for(String i:cars){
    System.out.println(i);
}
    }
}
