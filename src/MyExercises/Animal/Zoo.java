package MyExercises.Animal;

public class Zoo {

    public static void main(String[] args) {

        // flyable is actually a type. So we can create an instance variable of type
        // flyable. If we want sparrow to fly:
        Flyable flyingBird1 = (Flyable) new Sparrow(1, "F", 4);
        // the only method is .fly() from Flyable.java
        flyingBird1.fly();


        // the following instantiation gives an error since Bird does not implement
        // flyable interface and we cannot reference an object in memory that is a Bird
        // Bird only extends Animal
        // Flyable flyingBird2 = new Bird(2, "F", 3);
    }
}