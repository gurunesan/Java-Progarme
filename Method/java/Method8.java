package Method.java;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Method8 {

    static void object1(){
     for(String a: ZoneId.getAvailableZoneIds()) {
         System.out.println(a);
     }Scanner object2=new Scanner(System.in);
        System.out.println("enter zoneid");
        String b=object2.next();
        LocalDateTime t= LocalDateTime.now(ZoneId.of(b));
        System.out.println();
        System.out.println(t);
    }



    public static void main(String[] args) {
object1();
    }
}
