package exercises.String_Programs;

public class ToCharArrayAndValueOf_Finding_Vowels_Via_CharArray {
    // method to convert a string to charArray for parsing

    public static void main(String[] args) {

        String word = "LaunchCode";

        // create a new empty character array of size word.length()
         char[] chArr = new char[word.length()];


         // populate chArr
         for (int i = 0; i < chArr.length; i++) {
             chArr[i] = word.charAt(i);
         }

         // call 2 different method to remove vowels
         FindVowels(word);

    }

    public static String FindVowels(String word) {

        String newWord = "";
        // loop through char []
        String vowels = "aeiouAEIOU";

        // convert string word to charArray and loop
        for (char chr : word.toCharArray()) {
            // required to convert char type to string via String.valueOf()
            // since "" is a string
            if (vowels.contains(String.valueOf(chr))) {
                word.replace(String.valueOf(chr), "");
            } else {
                    newWord = newWord + chr;
                }

            }
        System.out.println(newWord);
        return newWord;
    }

}
