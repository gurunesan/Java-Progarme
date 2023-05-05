import java.util.Scanner;
public class ScannerMethod {
    static void object2() {
        int i = 0;
        int j = 0;
        String a[] = new String[2];
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter name");
        for (i = 0; i < a.length; i++) {
            a[i] = input2.nextLine();
        }

        int b[] = new int[2];
        System.out.println("enter number");
        for (j = 0; j < b.length; j++) {
            b[j] = input2.nextInt();
        }
     while((i<a.length)&&(j<a.length)){
         i++;
         System.out.println(a[i]+b[j]);
     }
    }


    public static void main(String[] args) {
        object2();
    }
}
