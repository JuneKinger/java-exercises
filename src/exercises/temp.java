package exercises;

import java.util.ArrayList;

// Java program to demonstrate working of split()
public class temp {
    public static void main(String args[])
    {
        String str = "this is code. this sentence is needed to be split. this ram. this is a new code";
        String [] strArr = str.split("this");
        int counter = 1;
        for (String a : strArr) {
            System.out.println(a);
            counter +=1;


        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr);

        }
    }
}
