package Oops;
import java.util.Scanner;
public class Studentinfo {
    public String name;
    public String std;
   public String phoneno;
  public  String address;
public int rollno ;
   public String halfyexamrank;

    public  void output() {
        System.out.println("name is:" + name);
        System.out.println("std is :" + std);
        System.out.println("phoneno is:" + phoneno);
        System.out.println("address is:" + address);
        System.out.println("halfyexamrank is :"+halfyexamrank);
    }
}
class infor{
    public static void main(String[] args) {
        Studentinfo info = new Studentinfo();
        info.rollno=12345;
        info.name = "guru";
        info.std = "x1";
        info.phoneno = "5668688687678";
        info.address = "hfgtfhdghdshgjs";
        info.halfyexamrank="76%";
        Scanner object1 = new Scanner(System.in);
        System.out.println("enter rollno:");
        int object2 = object1.nextInt();
        if(object2==info.rollno){
            info.output();
        }else{
            System.out.println("enter correct rollno");
        }
    }

}


