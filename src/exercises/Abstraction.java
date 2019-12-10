package exercises;

// Abstraction is process of hiding the implementation details and showing only the functionality.
abstract class Abstraction{
    public void disp(){
        System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();
}

class Demo extends Abstraction{
    /* Must Override this method while extending
     * Abstraction
     */
    public void disp2()
    {
        System.out.println("Demo overriding abstract method");
    }
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.disp2();
        obj.disp();
    }
}



