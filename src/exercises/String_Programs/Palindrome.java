package exercises.String_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String revStr = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a palindrome word: ");
        String str = scan.nextLine();
        scan.close();
        boolean is_palin = is_palindrome(str);
        System.out.println(is_palin);

    }

    public static boolean is_palindrome(String strg) {
        String rev = "";
        for (int i = strg.length() - 1; i >= 0; i--) {
            rev = rev + strg.charAt(i);
        }
        if (rev.equals(strg)) {
            return true;
        } else {
            return false;
        }
    }
}
