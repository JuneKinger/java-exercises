package MyExercises.Animal;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
    // All birds don't fly so we don't have fly() method in Birds, but because a sparrow
    // and other birds can fly, we want to have a fly method - we can do that with
    // interface flyable. Sparrow MUST implement the inherited abstract method flyable.
    // Sparrow can have as many interfaces as it wants but it only has one parent class
    // which is Bird in this case.

    // implementing flyable since Chicken cannot fly but Sparrow can.

    public void fly() {
        System.out.println("Sparrow flying high...");

    }
}
