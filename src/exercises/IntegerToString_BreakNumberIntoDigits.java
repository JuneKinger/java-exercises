package exercises;

import java.util.Scanner;

public class IntegerToString_BreakNumberIntoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();

        int len = Integer.toString(num).length();
        int digit;
        int temp;
        for (int i = 0; i < len; i++) {
            digit = num % 10;
            temp = num / 10;
            int place = len -i;
            System.out.println("Digit at index " + place + " is " + digit);
            num = temp;
        }

    }
}
