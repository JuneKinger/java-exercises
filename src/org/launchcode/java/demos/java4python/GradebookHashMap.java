package org.launchcode.java.demos.java4python;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class GradebookHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = in.nextDouble();
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        /* Map.Entry is a class which represents key-value pairs within HashMaps.
        The iterator variable student is of type Map.Entry.<String ,Double>
        */
        for (Map.Entry<String, Double> student : students.entrySet()) {
            /* Each Map.Entry object has a getKey method and a getValue method, which
            represent (surprisingly enough!), the key and value of the map item.
             */
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        /* If you only need to access the key of each item in a map, you can construct a simpler loop:

            for (String student : students.keySet())
            {
                System.out.println(student);
            }
         */

        /* If you only need the values, using students.values():

            for (double grade : students.values())
            {
                System.out.println(grade);
            }
        */

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }

}
