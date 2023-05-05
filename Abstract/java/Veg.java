package Abstract.java;

abstract class Veg {                       //abstract class does not directly call to main class
    String name="tomato";
    int price=45;
      void showveg(){
        System.out.println(name);
        System.out.println(price);
    }
}
class natveg extends Veg{                   // so we create a new class and inheritances the abstract class

}
class det{
    public static void main(String[] args) {       //the child class only call in main method in abstract class
        natveg obj1=new natveg();
        obj1.showveg();
    }
}