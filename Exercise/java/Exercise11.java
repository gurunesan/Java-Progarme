package Exercise.java;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter secods to calculate time");
        long a= obj.nextLong();
        long b=a%60;
        long c=a/60;
        long d=c%60;
         c=c/60;
        System.out.println(c+":"+d+":"+a);
    }
}
