package MyExercises.Animal;

public class Bird extends practiceCode.Animal {

    // since the bird is an animal, we need the same way of creating a bird as we
    // created an animal being a parent which is a parameterized constructor
    public Bird(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    // To avoid @Override in the Chicken class (since the chicken is a Bird but cannot fly)
    // we implement Interface which is a contract that any class that implements that
    // interface, it becomes compulsory for that class to implement the methods that are
    // defined in that interface


}
