package MyExercises.Animal;

public class Zoo {

    public static void main(String[] args) {

        // to make sparrow move
        Animal sparrow1 = new Sparrow(1, "M", 2);
        // or Sparrow sparrow1 = new Sparrow(1, "M", 2);
        // move() is defined in Bird class - "Flapping wings..."
        sparrow1.move();

        Animal fish1 = new Fish(2, "M", 1);
        // move() is defined in Fish class - "Fish is moving..."
        fish1.move();

        // prints "Fish is moving..." - the object here is a fish
        moveAnimal(fish1);

        // prints "Flapping wings..."
        moveAnimal(sparrow1);
    }
    // Say I want to move all animals to another place
    // moveAnimals() works for any kind of animal
    // polymorphism - the following 2 lines represents the general idea that the animal is able
    // to move and the parameter that this method has is of type Animal. It is a
    // parent type, so all of it's children can also be passed into this same method
    // this method can be used to move all different kinds of animals.
    public static void moveAnimal(Animal animal) {
        animal.move();

    }
}