package Exercise.java;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter number to check it is odd or even");
        int a=obj1.nextInt();
        if(a%2!=0){
            System.out.println("enter number is odd");
        }else{
            System.out.println("enter number is even");
        }
    }
}
