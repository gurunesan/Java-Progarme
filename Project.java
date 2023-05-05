import java.util.ArrayList;
import java.util.Scanner;

public class Project{
    public String name;
    public int rollno;
    public String dob;
    public String fathername;
    public String mothername;
    public long mobileno;
    public String address;
    public String get;
}
class stut1 extends Project{
    public void show1() {
        ArrayList<String> det1 = new ArrayList<String>();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter name:");
        det1.add(name = obj1.next());
        System.out.println("enter rollno");
        det1.add(String.valueOf(rollno=obj1.nextInt()));
            System.out.println("enter date of birth dd/mm/yyyy:");
        det1.add(dob = obj1.next());
        System.out.println("enter father name:");
        det1.add(fathername = obj1.next());
        System.out.println("enter mother name:");
        det1.add(mothername = obj1.next());
        System.out.println("enter mobile number:");
       det1.add(String.valueOf(mobileno=obj1.nextLong()));
        System.out.println("enter address:");
        det1.add(address = obj1.next());
        System.out.println("press 1 to back:" +" "+ "press 2 to next:");
        det1.add(get = obj1.next());
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("dob:"+dob);
        System.out.println("father name:"+fathername);
        System.out.println("mother name:"+mothername);
        System.out.println("mobile no:"+mobileno);
        System.out.println("address:"+address);
        System.out.println("\n");
       switch(get) {
           case "2":

               System.out.println("enter name:");
               det1.add(name = obj1.next());
               System.out.println("enter rollno:");
               det1.add(String.valueOf(rollno=obj1.nextInt()));
               System.out.println("enter date of birth dd/mm/yyyy:");
               det1.add(dob = obj1.next());
               System.out.println("enter father name:");
               det1.add(fathername = obj1.next());
               System.out.println("enter mother name:");
               det1.add(mothername = obj1.next());
               System.out.println("enter mobile number:");
               det1.add(String.valueOf(mobileno=obj1.nextLong()));
               System.out.println("enter address:");
               det1.add(address = obj1.next());
               System.out.println("name:"+name);
               System.out.println("rollno:"+rollno);
               System.out.println("dob:"+dob);
               System.out.println("father name:"+fathername);
               System.out.println("mother name:"+mothername);
               System.out.println("mobile no:"+mobileno);
               System.out.println("address:"+address);
               break;
           case"1":
               break;
       }

    }


}

class stut2 extends stut1{
}
class infro{
    public static void main(String[] args) {
stut2 object1=new stut2();
object1.show1();
    }
}
