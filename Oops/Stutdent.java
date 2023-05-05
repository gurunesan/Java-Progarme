package Oops;

class Stutdent {
    String name;
    int rollno;
    String address;
    String phoneno;

    public void display() {
        System.out.println("name is:" + name);
        System.out.println("rollno:" + rollno);
        System.out.println("address is:" + address);
        System.out.println("phoneno is:" + phoneno);
    }
}

    class Main {
        public static void main(String[] args) {
            Stutdent deatiles = new Stutdent();
            deatiles.name = "jhon";
            deatiles.rollno = 356;
            deatiles.address = "sdhgffhgdjhbdjhbvjs";
            deatiles.phoneno = "9498593899";
            deatiles.display();
            System.out.println();
            Stutdent d = new Stutdent();
            d.name = "ajay";
            d.rollno = 365;
            d.address = "fghfgjhfjhfgj";
            d.phoneno = "546346356363";
            d.display();
        }
    }
