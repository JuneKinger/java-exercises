package exercises.Animal;

public class Bird extends practiceCode.Animal {

    // since the bird is an animal, we need the same way of creating a bird as we
    // created an animal being a parent which is a parameterized constructor
    public Bird(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
    public void fly() {
        System.out.println("Flying...");
    }
}
