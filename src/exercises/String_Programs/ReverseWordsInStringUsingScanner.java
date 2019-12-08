package exercises.String_Programs;

import java.util.Scanner;

public class ReverseWordsInStringUsingScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string ");
        String str = scan.nextLine();
        String str_rev = "";

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String word_rev = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                word_rev = word_rev + word.charAt(j);
            }
            str_rev = str_rev + word_rev + " ";

        }
        System.out.println(str);
        System.out.println(str_rev);
    }
}

