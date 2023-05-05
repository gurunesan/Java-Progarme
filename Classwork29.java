;import java.util.Scanner;
public class Classwork29 {

 int a;
   public static void input() {
       int i = 0;
       int sum = 0;
       int a[] = new int[5];
       Scanner object1 = new Scanner(System.in);
       System.out.println("enter values");
       for (i = 0; i < a.length; i++) {
           a[i] = object1.nextInt();
       }
       System.out.println("enter character");
       char b = object1.next().charAt(0);

           switch (b) {
               case '+':
                   System.out.println(sum+=a[i]);
                   break;
               case '-':
                   System.out.println(sum -= a[i]);
                   break;
               case '*':
                   System.out.println(sum *= a[i]);
                   break;
               case '/':
                   System.out.println(sum /= a[i]);
                   break;
               case '%':
                   System.out.println(sum %= a[i]);
                   break;
               default:
                   System.out.println("enter crt character");
           }
       }
    public static void main(String[] args) {
       input();
    }
}