package exercises.String_Programs;

import java.util.Scanner;

public class IntegerToString_BreakNumberIntoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();

        // convert number to string to get length
        int len = Integer.toString(num).length();
        int digit;
        int temp;
        for (int i = 0; i < len; i++) {
            // modulus to get the right-most-digit
            digit = num % 10;
            // reduce the number by right-most digit
            temp = num / 10;
            int place = len -i;
            // get the index by len-i
            System.out.println("Digit at index " + place + " is " + digit);
            num = temp;
        }

    }
}
