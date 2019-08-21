package MyExercises.Animal;

public class Fish extends Animal {

    public Fish(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    public void move() {
        System.out.println("Fish is swimming...");
    }

    public void swim() {
        System.out.println("Swimming..");
    }
}
