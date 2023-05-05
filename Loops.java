import java.util.Scanner;

public class Loops {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("what you want to print");
     String a = input.nextLine();
     Scanner value = new Scanner(System.in);
     System.out.println("how many times want to print");
     long b = value.nextLong();
     int i;
     for(i=1;i<=b;i++) {
             System.out.println(a);
         }
 }
}
