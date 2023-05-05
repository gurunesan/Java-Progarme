import java.util.Scanner;

public class Samp {
    public String name;
    public int num;

    void show1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name");
        name = obj.nextLine();
        System.out.println("enter mobile number");
        num = obj.nextInt();
    }

    void show2() {
        System.out.println("name is:"+name);
        System.out.println("number:"+num);
    }

    public static void main(String[] args) {
        Samp obj = new Samp();
        obj.show1();
        obj.show2();
    }
}