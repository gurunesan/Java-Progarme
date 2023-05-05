package Oops;

public class Exer {               //Encapsulation method should have written by get and set values
    public String name;
     public int age;

    public void diaplay() {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public void setvalues(String myname, int myage) {    // set values .set the values in the data type
        name = myname;
        age = myage;
    }
        public String getvalue (String name) {         //get values return the values
return name;
        }
        public int getvalue(int age){
        return age;
        }
    }
class take{
    public static void main(String[] args) {
        Exer object1=new Exer();
      object1.setvalues("guru",20);
        object1.diaplay();
    }
}