package Hashmap.java;
import java.util.HashMap;
import java.util.Map;

public class Classwork1 {
    public static void main(String[] args) {
    HashMap<String,Integer>car=new HashMap<String,Integer>();
    car.put("thar",1500000);
        car.put("kia",1200000);
        car.put("bmw",2500000);
        car.put("scorpio",1400000);
        car.put("civic",100000);
        System.out.println(car);
        for(Map.Entry i: car.entrySet()){
            System.out.println(i.getKey()+":"+"\n"+"$ price="+i.getValue());
        }
    }
}