package Exercise.java;

public class Exercise32 {
    public static void main(String[] args) {
        int x=50;
        int y=5464745;
        while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x);
    }
}
