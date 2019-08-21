package MyExercises.Animal;

import practiceCode.Animal;

public class Zoo {

    public static void main(String[] args) {

        // we do not have visibility to any fly methods for the chicken anymore since we
        // implemented flyable in Sparrow Class

        // Now Bird bird1 = ... does not work but Sparrow bird1 will!
        // prints "Sparrow flying high..."
        Sparrow bird1 = new Sparrow(1, "M", 2);
        bird1.fly();

        // prints "Not able to fly ..."
        Chicken chick1 = new Chicken(2, "F", 5);
        chick1.fly();
    }
}