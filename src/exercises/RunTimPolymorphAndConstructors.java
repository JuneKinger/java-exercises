package exercises;

// In static polymorphism, compiler itself determines which method should call.
// Method overloading is an example of static polymorphism.
//
//In runtime polymorphism, compiler cannot determine the method at compile time.
// Method overriding(as your example) is an example of runtime polymorphism. Because in Runtime polymorphism (as your example),
// the signature of methodA() is similar in both the class X(base class) and Y(child class).
// So compiler cannot determine method at compile time which should execute. Only after object creation(which is a run time process),
// the runtime environment understand the exact method to call.
//
//It is because of that in this case, obj1.methodA() calls methodA() in Class X since obj1 is reference variable of object created for class X
//
//AND obj2.methodA() calls methodA() in Class Y since obj2 is reference variable of object created for class Y

class RunTimePolymorphAndConstructors
{
    RunTimePolymorphAndConstructors(){
        System.out.println("Parent constructor called");
    }
    public void methodA() //Base class method
    {
        System.out.println ("hello, I'm methodA of class X");
    }
}

class Y extends RunTimePolymorphAndConstructors
{
    Y(){
        System.out.println("Y constructor called");
    }

    public void methodA() //Derived Class method
    {
        System.out.println ("hello, I'm methodA of class Y");
    }
}

class Z
{
    public static void main (String args []) {
        RunTimePolymorphAndConstructors obj1 = new RunTimePolymorphAndConstructors(); // Reference and object X
        RunTimePolymorphAndConstructors obj2 = new Y(); // X reference but Y object
        obj1.methodA();
        obj2.methodA();
    }
}