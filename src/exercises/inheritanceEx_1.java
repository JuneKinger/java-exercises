package exercises;

// Basic oops - each subclass method overrides base class method
    class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class inheritanceEx_1 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
    }
}


