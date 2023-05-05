package Exercise.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise5 {
    public static void main(String[] args) {
        Date currenttime=new Date();
        SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss");
        System.out.println("TIME:-"+time.format(currenttime));
        SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("DATE:-"+date.format(currenttime));
    }
}
