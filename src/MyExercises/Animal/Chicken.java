package MyExercises.Animal;

public class Chicken extends Bird {
    public Chicken(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);

        }

    // Since chicken is inherited from Bird and Bird is inherited from Animal, chicken
    // has the visibility to all of those methods.

    // A chicken cannot fly so should not inherit the fly() method of Bird class
    // but a chicken IS a bird! So we define a specific method called fly() in the chicken
    // class called overriding. We are replacing a method that we are inheriting with a
    // method more specific to chicken in the Chicken class. If we did not have the method
    // below, the chicken WOULD be able to fly as it is a child of Bird.

    @Override
    public void fly() {
        System.out.println("Not able to fly...");

    }
}
