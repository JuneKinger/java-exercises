package exercises.school;

import java.util.ArrayList;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    //private static final ArrayList<Object> course = new ArrayList<>();

    // constructor is used to initialize an object's state. It is called only when
    // an instance of an object is created using the new() keyword,
    // a parameterized constructor is called when we want to initialize fields of the class with our
    // own values.
    public Student(String name, Integer studentID, Integer numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }

    // constructor - parameterized constructor initializes name and studentId data members
    // with the values of passed arguments while the object of that class is created.
    // this() is same as this.name = name and this.studentId = studentId
    // under a parameterized constructor, we do SOMETHING with what is passed through, even only
    // printing the parameters, eg: System.out.println(name + studentId)
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }


    // constructor
    public Student(String name) {
        Student john = new Student("John");
        System.out.println("john");
        //this(name, nextStudentId);
        nextStudentId ++;
    }

    // instance method (an object of your class MUST be created to access the method)
    // this method has parameters passed that would affect
    // the data members - a method can either can be static method or instance method
    // to access a field, you must use this.
    public void addGrade(int courseCredits, double grade) {
        // not right!!!!
        // gpa = grade / courseCredits;
        this.numberOfCredits = courseCredits;

    }

    public String getGradeLevel() {
        String grade = "";
        if (this.numberOfCredits >= 88 ) {
            return grade = "Senior";
        } else if (this.numberOfCredits >= 56) {
            return grade = "Junior";
        } else if (this.numberOfCredits >= 28) {
            return grade = "Sophomore";
        } else {
            return grade = "Freshman";
        }
    }

    // Getters and Setters - to view/get/access the value of name
    public String getName() {
        return name;
    }
    // aName (maybe user input) is passed to set/change the value of name
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

     private void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
