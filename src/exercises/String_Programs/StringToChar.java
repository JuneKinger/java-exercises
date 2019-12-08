package exercises.String_Programs;

public class StringToChar {
    public static void main(String[] args)  {

        // using charAt() method
        String str = "Hello";
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at " + i + " position " + ch);

        }
    }

}
