package exercises.String_Programs;

public class CharToString {
    public static void main(String[] args) {

        // must use only single quotes for char initialization
        char ch = 'z';
        // using toString
        String str = Character.toString(ch);
        System.out.println("String is " + str);

        // using valueOf
        String str1 = String.valueOf(ch);
        System.out.println("String is " + str1);

    }
}
