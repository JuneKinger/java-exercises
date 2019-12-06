package exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class camelCase {

    // Complete the camelcase function below.
    // print number of words in String which has camelCase from 2nd word onwards eg. camelCaseIfFun will output 4.
    static int camelcase(String s) {
        int counter = 0;
        for (int i=0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter +=1;
            }
        }
        counter +=1;
        return counter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        System.out.println(bufferedWriter);
        bufferedWriter.close();

        scanner.close();
    }
}
