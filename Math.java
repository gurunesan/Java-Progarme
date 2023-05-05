import java.util.Scanner;
public class Math {
    public static void main(String[] args){
        Scanner getting=new Scanner(System.in);
        System.out.println("enter values");
        int a,c=1;
        while(true) {
            a = getting.nextInt();
            if (a < 0) {
                break;
            }
            c=a*c;
        }System.out.println(c);
    }
}
