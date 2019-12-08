package exercises.String_Programs;

import java.util.Scanner;

public class ReverseWordsInStringUsingObjects {

    public void reverseWordsInString(String str) {

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

    public static void main(String[] args) {
        ReverseWordsInStringUsingObjects obj = new ReverseWordsInStringUsingObjects();
        obj.reverseWordsInString("Launchcode is a great school");
        obj.reverseWordsInString("I like Java and Python");
    }
}