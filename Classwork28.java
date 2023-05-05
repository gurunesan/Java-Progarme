
public class Classwork28 {
    public static void main(String[] args)
    {
        int[] a = {5, 7, 2, 4, 9};

        int b = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
                b++;
        }
        System.out.println("even number :"+ (b));
        System.out.println("odd number :       "+ (a.length-b));
    }
}