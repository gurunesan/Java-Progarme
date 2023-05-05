package Exercise.java;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        String c =" ";
        Scanner obj=new Scanner(System.in);
        System.out.println("enter word to reverse");
        String a= obj.nextLine();
        char b[]=a.toCharArray();
        for(int i=b.length-1;i>=0;i--){
            c+= String.valueOf(b[i]);
        }
        System.out.print("your word reversed:"+c);
    }
}
