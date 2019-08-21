package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookHashMapExercise {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);

        String inputName;

        System.out.println("Enter your students (or ENTER to finish)");

        // get student names and IDs //
        do {
            System.out.print("Enter student name: ");
            inputName = in.nextLine();

            if (!inputName.equals("")) {
                System.out.print("Enter student ID: ");
                Integer inputId = in.nextInt();

                // .put() adds a key/value pair to a map //
                students.put(inputId, inputName);
                // nextInt() does not execute \n hence the following code //
                in.nextLine();
            }
        } while (!inputName.equals(""));

        System.out.println("Class roster:");

        /* The iterator student is of type Map.Entry<Integer, String>
            with class Map.Entry */
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");

        }

    }
}
