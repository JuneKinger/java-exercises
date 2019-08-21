package practiceCode;

// class contains instructions on how objects can be created
// as well as how the objects carry out certain behaviour
public class Human {

    // all objects created using this class will have these attributes only
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // constructors - provides a way to construct objects of the class of type human
    // no return type and exact same name as class name
    // default constructor method, such as below, can be left out
    public Human() {

    }
    // basic behaviours of humans - instance methods
    public void speak() {
    System.out.println("Hello, my name is " + name);
    System.out.println("I am " + heightInInches + " inches tall");
    System.out.println("I am " + age + " years old");
    System.out.println("My eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("eating...");
    }
    public void walk() {
        System.out.println("walking...");
    }
    public void work() {
        System.out.println("working...");
    }

}