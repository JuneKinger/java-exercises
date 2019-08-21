package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class TempConv {
    /* main must be declared as public , since it
    must be called by code outside of its class when
    the program is started - anyone can call it
    static: main method has to be declared static because
    keyword static allows main to be called without creating
    an object of the class in which the main method is defined
    - in this case TempConv
    static tells Java that this is a method that is part of the class
    but does not belong to any one instance of the class. Rather,
    it is shared by all instances. With the static method, the object
    to the left of the . is a class, not an instance of the class.
    The way that we would call the main method directly is: TempConv.main(parameter1)
    We do not require an instance for the method to be called unlike Python
    main: name of the method for the class TempConv */
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        // declare variable in of Scanner type //
        Scanner in;

        /* create a scanner object and return a reference to in.
        system.in object (parameter) tells compiler that
        input will be from std input, typically  thru keyboard but
         also could be through file, etc. */
        in = new Scanner(System.in);

        /* instead of the above 2 lines, we can declare and initialize
        on same line: Scanner in new Scanner(System.in);
         */
        System.out.println("Enter the temperature in F: ");

        /* use the scanner object "in" to read in a number
        Because variable fahrenheit was declared as a double, we must call
        the method nextDouble()
         */

        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + celsius);
    }

}
