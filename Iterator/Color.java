package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Color {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        Iterator<String> a=colors.iterator();
        System.out.println(a.next());     //in iterator we print the values from arraylist we should use "object name.next()".
   while(a.hasNext()){
       System.out.println(a.next());
   }System.out.println(colors.contains("blue"));
    }
}
