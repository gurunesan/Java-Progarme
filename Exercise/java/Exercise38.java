package Exercise.java;

import java.util.Arrays;

public class Exercise38 {
    public static void main(String[] args) {
        String[] a = {"dog", "cat", "cow", "monkey", "elephant"};
        int i=0;
       for(i=0;i<a.length;i++){
           if(a[i].length() >a.length+1) {
               a = new String[]{a[i]};
               System.out.println(Arrays.toString(a));
           }
           }
       }
            }


