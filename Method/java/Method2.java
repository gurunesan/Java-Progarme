package Method .java;
import java.util.Scanner;
public class Method2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str = in.nextLine();
        System.out.print("Number of words in the string: " + count_Words(str));
    }

    public static int count_Words(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        count = count + 1;
        return count;
    }
}

