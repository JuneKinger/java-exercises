package MyExercises.Animal;

// class contains instructions on how objects can be created
// as well as how the objects carry out certain behaviour
public abstract class Animal {

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

    // It is requiring us to make this class an abstract class because it has an abstract
    // method. So any class that is a child of this class is going to need the move method
    // implemented. We are not implementing it in this class, we are just creating an
    // abstraction for the idea of moving, and this class does not tell a particular
    // animal how to move - a fish can swim, a bird can fly, a chicken can walk - so these
    // are different types of movements based on how an animal moves. So this allows for
    // abstracting the idea that one animal moves differently from another.
    // An abstract class will have abstract methods in it and you cannot instantiate an
    // instance of an abstract class. It is only meant to be a parent for another class so
    // expects child classes to implement the abstract method. So Fish and Bird class, for eg, needs
    // to implement this method move()
    public abstract void move();
}