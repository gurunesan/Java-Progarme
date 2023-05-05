package Inheritances;

public class Bankpoly {
  public  String name;
  public  int moblie;
   public int acno;
}
class user extends Bankpoly{
   public String name="dish";
  public  int moblie;
  public  int acno=23498239;
  void show1(){
      System.out.println("name:"+name);
      System.out.println("acno:"+acno);
  }
  void show1(int mobile1,int mobile2){
      System.out.println("moblie 1:"+mobile1);
      System.out.println("mobile2:"+mobile2);
  }
}
class bank{
    public static void main(String[] args) {
        user obj1=new user();
        obj1.show1();
        obj1.show1(65463474,64394878);
    }

}

