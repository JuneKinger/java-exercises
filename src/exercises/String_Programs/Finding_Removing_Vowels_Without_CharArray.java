package exercises.String_Programs;

public class Finding_Removing_Vowels_Without_CharArray {

    public static void main(String[] args) {
        // use replaceAll() method

        String word = "LaunchCode";
        String finalWord = "";
        String rem_vowels = "";

        rem_vowels = remove_vowels(word);

        finalWord = remove_even(rem_vowels);
        System.out.println(finalWord);
    }

    public static String remove_vowels(String word) {

        String newWord = "";
        String vowels = "aeiouAEIOU";

        return word.replaceAll("[aeiouAEIOU]", "");

    }

    public static String remove_even(String wrd) {

        String newWrd = "";
        for (int i = 0; i < wrd.length(); i++) {
            // When i = even, I want to keep that char
            // eg. LnchCd, I want to keep (index 0)L, c (index 2), C (index 4) which are even indexes
            if (i % 2 == 0) {
                newWrd = newWrd + wrd.charAt(i);
            }
        }
        //System.out.println(newWrd);
        return newWrd;

    }
}
