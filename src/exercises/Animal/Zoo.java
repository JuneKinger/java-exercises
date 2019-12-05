package exercises.Animal;

import practiceCode.Animal;

public class Zoo {

    public static void main(String[] args) {

        // create an animal variable of type Animal
        // We have already defined what constructor we want to use in Animal class -
        // need to pass in values in the parameterized constructor since Animal is a parameterized
        // constructor. animal1 is an instance variable.
        // the methods that are visible for animal1 are only those of Animal class since
        // the type of object here is Animal
        practiceCode.Animal animal1 = new Animal(12, "M", 23);

        // invoke methods on this particular variable animal1 which points to the object
        // created above in memory. We ask that variable to make the object that you are pointing
        // to execute this particular method at runtime. They get their behaviour from Animal type
        // the methods that are visible to the variable are based on the type of that variable
        animal1.eat();

        // to properly instantiate a bird, we need to add the parameters the same that we
        // added to the Bird class
        Bird bird1 = new Bird(3, "F", 6);
        // we need to invoke the method that is defined in the parent class now. Now the bird
        // is capable of eating and sleeping AS WELL AS the method defined in the Bird class
        bird1.eat();
        bird1.sleep();
        bird1.fly();

    }
}