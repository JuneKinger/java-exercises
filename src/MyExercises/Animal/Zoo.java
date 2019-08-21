package MyExercises.Animal;

import practiceCode.Animal;

public class Zoo {

    public static void main(String[] args) {

        Chicken chick1 = new Chicken(1, "F", 2);

        // invoking the fly behaviour on this instance variable of type Chicken, it
        // will execute the overriding method in Chicken
        chick1.fly();
    }
}