package MyExercises.Animal;

// interface name should be named after the functionality we are trying to abstract a way

public interface Flyable {

    // we don't give a body to this method - these methods are called Abstract methods
    // an interface only has abstract methods. In the bird class, we have removed the fly
    // behaviour, but now the Sparrow is no longer able to fly, but since we have the
    // interface flyable defined, we can implement flyable in Sparrow class so Sparrow
    // is able to fly.

    // An abstract class will have abstract methods in it and you cannot instantiate an
    // instance of an abstract class. It is only meant to be a parent for another class so
    // expects child classes to implement the abstract method.
    public void fly();

}
