package MyExercises.Animal;

// interface name should be named after the functionality we are trying to abstract a way

public interface flyable {

    // we don't give a body to this method - these methods are called Abstract methods
    // an interface only has abstract methods. In the bird class, we have removed the fly
    // behaviour, but now the Sparrow is no longer able to fly but since we have the
    // interface flyable defined, we can implement flyable in Sparrow class.
    public void fly();

}
