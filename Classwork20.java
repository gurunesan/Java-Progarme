public class Classwork20 {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,7};
        int totalnumber = 7;
        int sum = 0;
        int missing = totalnumber * ((totalnumber +1) / 2);
        for (int i : a) {
            sum += i;;
        }
System.out.println(missing-sum);

    }
}