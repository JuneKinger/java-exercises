package exercises;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        /* Array_List is a collection class, NOT of
         fixed size (unlike arrays), that contains elements as objects
         which requires a set of elements to access and
         modify them.
         */

        /* Call the ArrayList constructor "new ArrayList<>()".
        We declared arrIntegers to be of type ArrayList<Integer> using
        the wrapper class Integer since all values stored in collections
        must be objects - so we use wrapper classes in those situations.
        Declared and initialized object arrIntegers
         */
        ArrayList<Integer> arrIntegers = new ArrayList<>();

        arrIntegers.add(2);
        arrIntegers.add(4);
        arrIntegers.add(7);
        arrIntegers.add(9);
        arrIntegers.add(12);
        arrIntegers.add(26);
        arrIntegers.add(22);
        arrIntegers.add(12);
        arrIntegers.add(6);
        arrIntegers.add(10);

        int sum = 0;
        for (int integ : arrIntegers) {
            if (integ % 2 == 0) {
                sum += integ;
            }
        }
        System.out.print("The sum of even numbers = " + sum);

    }

}
