package Exercise.java;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first value");
        long a= obj.nextInt();
        System.out.println("enter second value");
        long b= obj.nextInt();
        long sum=a+b;
        String number[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(sum<10){
            System.out.println(sum);
            System.out.println("answer is:"+number[(int) sum]);
        } else if (sum<100) {
            long x=sum/10;
            long y=sum-x*10;
            System.out.println(sum);
            System.out.println("answer is:"+number[(int) x]+" "+number[(int) y]);
        }else{
           long x = sum / 100;
           long y = (sum - x * 100) / 10;
          long  z = sum- x * 100 - y * 10;
            System.out.println(sum);
            System.out.println("answer is:"+number[(int) x]+" "+number[(int) y]+" "+number[(int) z]);

        }
    }
}
