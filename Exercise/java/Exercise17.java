package Exercise.java;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number to find modules");
        System.out.println();
        System.out.println("enter first number");
        int a= obj.nextInt();
        System.out.println("enter second number");
        int b= obj.nextInt();
        int c=a/b;
        int d=a-(c*b);
        System.out.println(d);
    }
}
