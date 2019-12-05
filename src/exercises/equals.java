package exercises;

public class equals {

    public static void main(String[] args) {

        String myCar1 = new String("blue");
        String myCar2 = myCar1;
        String myCar3 = new String("blue");

        System.out.println(myCar1 == myCar1);       // true
        System.out.println(myCar1 == myCar2);       // true
        System.out.println(myCar1 == myCar3);       // false

        System.out.println(myCar1.equals(myCar1));  // true
        System.out.println(myCar1.equals(myCar2));  // true
        System.out.println(myCar1.equals(myCar3));  // true

        // the equality operator compares two references or memory addresses in the stack space
        // and does not compare their values
        // .equals() method compares objects in the heap space where the values are compared to each other

    }
}
