package TreeMap.java;

import java.util.Map;
import java.util.TreeMap;

public class Classwork5 {
    public static void main(String[] args) {
        TreeMap<String,Integer>bike=new TreeMap<String,Integer>();
        bike.put("ktm",150000);
        bike.put("mt15",170000);
        bike.put("re",155000);
        bike.put("scooty",120000);
        bike.put("rc",200000);
        System.out.println(bike.entrySet());
        Boolean result=bike.containsKey("re");
        System.out.println(result);
        System.out.println(bike.size());
        for(Map.Entry i: bike.entrySet()){
            System.out.println("\n"+i);
        }
    }
}