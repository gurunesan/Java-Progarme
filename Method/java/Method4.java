package Method.java;
import java.util.Scanner;
public class Method4 {
    static void object1() {
        String a;
        String b = ("!@#$%^&*()_-+={}[],./?");
        Scanner object2 = new Scanner(System.in);
        System.out.println("A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits");
        a = object2.nextLine();
        if (is_Valid_Password(a)) {
            System.out.println("Password is valid: " + a);
        } else {
            System.out.println("Not a valid password: " + a);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length()>=8) return true;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }







    public static void main(String[] args) {
        object1();
    }
}
