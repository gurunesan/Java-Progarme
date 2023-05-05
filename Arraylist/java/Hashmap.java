package Arraylist.java;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<String, String>();
        country.put("india", "delhi");
        country.put("japan", "tokiyo");
        country.put("england", "london");
        country.put("cannada", "toranto");
        System.out.println(country.get("india"));
        System.out.println(country.size());
        System.out.println(country);
        System.out.println(country.values());
        for(String i:country.keySet()) {
            System.out.println(country.get(i));
        }
     //   for (String i : country.keySet()) {
         //   System.out.println(i);
      //  }
    }
}
