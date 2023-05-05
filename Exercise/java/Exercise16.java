package Exercise.java;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter first number");
        int a = obj.nextInt();
        System.out.println("enter second number");
        int b = obj.nextInt();
        System.out.println(result(a,b));
    }

    public static int result(int c, int d) {
        if (c == d)
            return 0;
        if (c%6==d%6)
            return (c>d)?c:d;
        return(d>c)?d:c;
    }
}
