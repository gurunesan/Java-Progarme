package Exercise.java;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a sentence to find the word before the word");
        String a= obj.nextLine();
        String b[]=a.split("[ ]+");
        System.out.println(b[b.length-2]);
    }
}
