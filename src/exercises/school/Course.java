package exercises.school;

import java.util.ArrayList;

public class Course {

    private Integer numOfStudents;
    private String teacher;
    private String courseName;
    private ArrayList<String> student = new ArrayList<>();

    public Course(Integer numOfStudents, String teacher, String courseName, ArrayList student) {
        this.numOfStudents = numOfStudents;
        this.teacher = teacher;
        this.courseName = courseName;
        this.student = student;
    }

    public Integer getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(Integer numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getTeacher() {
        return teacher;
    }
    /* set the instance variable teacher - usually using the prefix a to avoid
    shadowing and having to use this in our setters
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}

