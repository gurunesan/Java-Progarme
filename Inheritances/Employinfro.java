package Inheritances;

public class Employinfro{
    public static void main(String[] args) {
      employ1 obj1=new employ1();
        obj1.emp1();
      obj1.setSalary(1000000);
        System.out.println("your salary is:"+obj1.getSalary());
        employ2 obj2=new employ2();
        obj2.emp2();
        obj2.setSalary(50000);
        System.out.println("your salary is:"+obj2.getSalary());



    }
}
