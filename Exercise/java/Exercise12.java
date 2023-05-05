package Exercise.java;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        String d=" ";
        Scanner obj=new Scanner(System.in);
        System.out.println("enter sentence to atuomatically convert the first as a capital letter");
        String a= obj.nextLine();
        System.out.println("entered sentence:"+a);
        Scanner b=new Scanner(a);
        while(b.hasNext()){
            String c=b.next();
             d+=Character.toUpperCase(c.charAt(0)) + (c.substring(1)+" ");
        }
        System.out.println("printed sentence:"+d.trim());
    }

}
