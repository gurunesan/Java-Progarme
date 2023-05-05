package Oops;
       // Encapsulation concept.
public class Car {
    public String name;
    public String colour;
    public long price;
    public Car(String carname,String carcolour,long carprice){
        this.name=carname;
        this.colour=carcolour;
        this.price=carprice;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(colour);
    }
    public void setvalues(String carname,String carcolour){
        this.name=carname;
        this.colour=carcolour;
    }
    public void setvalues (long carprice){
        this.price=carprice;
    }
    public String getvalues(String name) {
        return name;
    }
    public String getvalue (String colour){
            return colour;
        }
        public long getvalues(long price){
        return price;
        }
}
class out{
    public static void main(String[] args) {
        Car object2=new Car("thar","black",1500000);
      object2.disp();
      Car obj1=new Car("scorpio","white",2000000);
      obj1.disp();
    }
}