package Exercise.java;

import java.util.HashSet;
import java.util.Arrays;

public class Exercise37 {
    public static void main(String[] args) {
                int[] arr = { 1, 2, 3, 2, 1, 4, 5, 4,5 };

                // Convert array to HashSet to remove duplicates
                HashSet<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < arr.length; i++) {
                    set.add(arr[i]);
                }

                // Convert HashSet back to array
                Integer[] newArr = new Integer[set.size()];
                set.toArray(newArr);

                // Print the new array
                System.out.println(Arrays.toString(newArr));
            }
        }
