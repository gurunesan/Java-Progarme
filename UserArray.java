import java.util.Scanner;
public class UserArray {
    public static void main(String[] args){
        int a[]=new int[10];
        int i=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter values");
       for( i=0;i<a.length;i++)
           a[i]=input.nextInt();
for(i=0;i<a.length;i++)
       System.out.println(a[i]);
    }
}
