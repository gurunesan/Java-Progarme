package Exercise.java;

import java.util.Arrays;

public class Exercise24 {
    public static void main(String[] args) {
        String sum="";
        int a[]={1, 3, -5, 4};
        int b[]={1, 4, -5, -2};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i=0;i<a.length;i++){
            int  c=a[i];
            int d=b[i];
            sum+=c*d+" ";

        }
        System.out.println(sum);
    }
}
