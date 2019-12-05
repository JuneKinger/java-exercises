package exercises;

public class polymorphicEx_2 {
    // taken from inheritanceEx_1
    /* do not need object Shape nor the method within it
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

*/

    // Run time polymorphism -reference type belongs to the parent
    // but object belongs to the child. Takes from inheritanceEx_1.java
        public static void main(String[] args) {
            Shape s;
            s = new Circle();       // polymorphic statement - objects belong to the child
            // Drawing a circle
            s.draw();
            s = new Rectangle();
            // Drawing a rectangle
            s.draw();
        }
    }

