package Interface.java;

interface Father {
    abstract void tell();
    abstract void give();
}
interface Mother{
    abstract void tell2();                //in interface class we should overwrite the method
    abstract void give2();
}
class son implements Father,Mother{
    public void tell(){                           // in overwriting of abstract method we should put public
        System.out.println("father: go to shop and buy battery");
    }
    public void give(){
        System.out.println("he gives 20 rupees");
    }
    public void tell2() {
        System.out.println("mother: go to shop and buy 1kg of tomato");
    }
    public void give2() {
        System.out.println("she gives 50 rupees ");
    }
}
