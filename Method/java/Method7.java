package Method.java;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Method7 {
    static void object1(){
 Date currentdate=new Date();
        SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss a");
        System.out.println(time.format(currentdate));
       SimpleDateFormat date=new SimpleDateFormat("dd/MM/YYYY-MMMM");
        System.out.println(date.format(currentdate));
        SimpleDateFormat day=new SimpleDateFormat("EEEE");
        System.out.println(day.format(currentdate));

    }


    public static void main(String[] args) {
object1();
    }
}
