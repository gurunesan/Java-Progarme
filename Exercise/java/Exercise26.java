package Exercise.java;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter value");
        int n= obj.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else{
            if(n%2!=0){                   // its odd ;
               n= (n*3+1);
                System.out.println(n);
            }
        }
    }
}
