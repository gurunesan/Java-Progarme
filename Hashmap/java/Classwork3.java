package Hashmap.java;
import java.util.HashMap;
import java.util.Map;

public class Classwork3 {
    public static void main(String[] args) {
        HashMap<String,String>info=new HashMap<String,String>();
        info.put("name1", "guru");
        info.put("name2","dinesh");
        info.put("name3","jeevan");
        info.put("name4","mani");
        info.put("name5","rahul");
        for(Map.Entry i: info.entrySet()){
            System.out.println(i);
        }
        System.out.println(info);
    }
}
