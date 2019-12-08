package exercises;

public class StringSplit_CountNumberOfWordsInString {
    public static void main(String[] args) {
        String str = "LaunchCode is a great school";
        int spacesInString = 0;
        spacesInString = countSpaces(str);
        System.out.println(spacesInString);
    }

    public static int countSpaces(String strg) {
        String [] strSplit = strg.split(" ");
        return strSplit.length;

    }
}
