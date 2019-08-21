package exercises;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        /* variable in will reference a Scanner object to read
         from System.in object - pass as argument the System.in object
         declare and initialize in one step*/
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        // use scanner object to get string input //
        String name = in.next();

        System.out.println("Hello " + name);
    }
}
