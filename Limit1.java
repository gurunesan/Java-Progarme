import java.util.Scanner;

public class Limit1 {
    private static int getIntInputBelowCertainLength(String prompt, Scanner scanner, int maxLength) {
        int validInteger = -1;
        System.out.print(prompt);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                validInteger = scanner.nextInt();
                if (String.valueOf(validInteger).length() >= maxLength) {
                    break;
                } else {
                    System.out.println("ERROR: Input integer was too long, try again...");
                    System.out.print(prompt);
                }
            } else {
                System.out.println("Error: Invalid input, must be an integer, try again...");
                System.out.print(prompt);
                scanner.next();
            }
        }
        return validInteger;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maxLength = 8;
            String prompt = String.format("Enter an integer with less than %d digits: ", maxLength);
            int num = getIntInputBelowCertainLength(prompt,scanner,maxLength);
            System.out.printf("Valid input! You entered: %d, an integer less than or equal to %s characters long%n",
                    num, maxLength);
        }
    }
}
