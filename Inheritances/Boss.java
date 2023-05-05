package Inheritances;

public class Boss {
    public String name="employ1"+"\n"+"employ2";

    public String roll="senior"+"\n"+"junior";

    private int salary;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class employ1 extends Boss{

public String  roll="senior";
   void emp1(){
       System.out.println(roll);
   }
}
class employ2 extends employ1{
    public String roll="junior";
    void emp2(){
        System.out.println(roll);
    }
}

