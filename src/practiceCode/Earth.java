package practiceCode;

public class Earth {

    //  entry point for java all applns where code is executed
    // sequentially line by line inside of this method
    public static void main(String[] args) {

        // create a new Human variable from constructor Human (from Human class)
        // Note: tom is just a variable object now. Objects come into existence when the
        // appln runs. Right now, we are just creating a structure.
        Human tom = new Human();
        // at runtime, at this point tom.speak will print empty fields since we have not
        // assigned any values to them yet.

        // assign values to fields
        tom.name = "Tom Smith";
        tom.age = 5;
        tom.heightInInches = 36;
        tom.eyeColor = "brown";

        tom.speak();

        Human joe = new Human();

        joe.name = "Joe Doe";
        joe.age = 60;
        joe.heightInInches = 72;
        joe.eyeColor = "blue";

        joe.speak();

    }

}
