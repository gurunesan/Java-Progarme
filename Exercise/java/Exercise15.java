package Exercise.java;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number");
        int a= obj.nextInt();
        System.out.println("enter second number");
        int b= obj.nextInt();
        System.out.println("enter third number");
        int c= obj.nextInt();
        System.out.println((a-b>=20)||(a-c)>=20||(b-c>=20));
    }
}
