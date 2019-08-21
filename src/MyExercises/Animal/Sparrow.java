package MyExercises.Animal;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    // implementing flyable since Chicken cannot fly but Sparrow can. Sparrow MUST implement
    // the inherited abstract method flyable.fly(). Sparrow can have as many interfaces as
    // it wants but it only has one parent class.

    public void fly() {
        System.out.println("Sparrow flying high...");

    }
}
