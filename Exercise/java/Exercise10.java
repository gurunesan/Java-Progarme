package Exercise.java;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter values to compare");
        int a= obj1.nextInt();
        int b= obj1.nextInt();
        if(a<b){
            System.out.println("b is high value");
        }else{
            System.out.println("a is high value");
        }
    }
}
