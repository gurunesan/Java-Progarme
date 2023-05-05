package Method.java;

public class Method5 {
    static void object1() {
        int a[][] = new int[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%2d", (int) (Math.random() * 2));
            }
        }
    }
            static void object2 () {
                int a[][] = new int[10][10];
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        System.out.printf("%2d", (int) (Math.random() * 2));
                    }
                    System.out.println();
                }
            }
            public static void main (String[]args){
                int a=12345;
                System.out.println(a);
                object1();
                object2();
            }
        }
