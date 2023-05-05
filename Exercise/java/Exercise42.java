package Exercise.java;

import java.util.Arrays;

public class Exercise42 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        int a[] = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b = a[i];
                System.out.println("negative numbers:"+b);
            }
        }
        System.out.println();
        for(int j=0;j<a.length;j++){
            if(a[j]>0){
                c=a[j];
                System.out.println("postive numbers:"+c);
            }
        }
    }
}

