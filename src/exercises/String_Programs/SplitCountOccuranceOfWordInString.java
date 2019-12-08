package exercises.String_Programs;

public class SplitCountOccuranceOfWordInString {
    public static void main(String [] args) {
        String str = "this is an example. this is a program. this program checks if this occurs in this string";
        String[] strArr = str.split("this");

        // need the -1 since if the word starts with "this", the count is added to with the first element as ""
        // {"", " is an example. ", " is a program.", " program checks if ", " occurs in ", " string"}
        System.out.println(strArr.length-1);
    }
}
