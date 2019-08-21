package MyExercises.Animal;

// class contains instructions on how objects can be created
// as well as how the objects carry out certain behaviour
public class Animal {

    // all objects created using this class will have these attributes only
    int age;
    String gender;
    int weightInPounds;

    // parameterized constructor - provides a way to construct objects of the class of type human
    // no return type and exact same name as class name

    // these are instructions of how a proper animal should come into existence
    // in our application, so we have to pass in values in our constructor in the Zoo class
    public Animal(int age, String gender, int weightInPounds ) {
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }
    // basic behaviours of animals - instance methods
    // this behaviour is exhibited by all animals, including birds and fish so we place
    // them here in the Animal class
    // So how do we organize our code so that other classes can take advantage of these
    // behaviours too? Via inheritance. To do this, we make sure that the class that is
    // wanting to inherit the parent class is actually a breed of the parent. Here a bird
    // and fish are animals so it makes sense for the bird and the fish to be inheriting
    // behavior of the animal - we do this via extends in the child classes.
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

}