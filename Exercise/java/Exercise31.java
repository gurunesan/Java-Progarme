package Exercise.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        int i=0;
        String a[]={"1","3","4","56","78","10","45","34","59","98"};
        Scanner obj =new Scanner(System.in);
        System.out.println("after which number you want to print");
        String b= obj.nextLine();
        for(i=0;i<a.length;i++){
           switch (b){
               case "1":
                   System.out.print(a[i].indexOf(b));
                   int c=a[i].indexOf(b);
                   for(int j =c; j>=c; j++){
                       System.out.println(a[j]);
                   }
           }
        }
    }
}
