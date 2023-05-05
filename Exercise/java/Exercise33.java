package Exercise.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise33 {
    public static void main(String[] args) {
  int a[]={1,6,9,1};
  int b[]={2,5,7,8};
  int[] merge= Arrays.copyOf(a,a.length+b.length);
  System.arraycopy(b,0,merge,a.length,b.length);
        System.out.println(Arrays.toString(merge));

    }
}
