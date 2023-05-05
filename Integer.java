import java.util.Scanner;
public class Integer {
    public static void main(String[] args){
        int a[]=new int [5];
     int i=0;
     int b=a[i];
     Scanner values=new Scanner(System.in);
     System.out.println("enter values");
     for(i=0;i<a.length;i++){
          a[i]=values.nextInt();
         if(b<a[i]) {
             b = a[i];
         }
     }System.out.println(b);
    }
}
