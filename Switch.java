import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner myobject=new Scanner(System.in);
        System.out.println("Enter values");
        long x= myobject.nextLong();
        long y= myobject.nextLong();
        Scanner object=new Scanner(System.in);
        System.out.println("enter character +,-,/,%,*");
        char a=object.next().charAt(0);
        switch (a){
            case '+':
                System.out.println((x)+(y));
                break;
            case'-':
                System.out.println((x)-(y));
                break;
            case'/':
                System.out.println((x)/(y));
                break;
            case'%':
                System.out.println((x)%(y));
                break;
            case'*':
                System.out.println((x)*(y));
                break;
            default:
                System.out.println("Enter correct character");
        }

    }
}
