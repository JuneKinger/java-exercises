package exercises;

public class ReverseString {
    public static void main(String [] args) {
        String str = "LaunchCode";
        String str_rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str_rev = str_rev + str.charAt(i);
        }
        System.out.println(str_rev);
    }
}
