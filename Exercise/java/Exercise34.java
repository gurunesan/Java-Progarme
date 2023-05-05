package Exercise.java;

public class Exercise34 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i%5==0) {
                System.out.println(i+":"+"Fizz Buzz");
            }
           else if (i % 5 == 0) {
                System.out.println(i+":"+"Buzz");
            } else if (i%3==0) {
                System.out.println(i+":"+"Fizz");
            }
        }
    }
}
