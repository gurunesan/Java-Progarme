import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        //break and continue statement
        Scanner user=new Scanner(System.in);
        System.out.println("enter values");
        long a=user.nextInt();
        for(long i=a;a>=0;a--){
            if(a%10==0){
                System.out.println(a);
                break;
            }
        }

    }
}
