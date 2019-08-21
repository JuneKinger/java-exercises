package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.Scanner;

public class  CountingChar_InputStringFromUser
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> countingMap = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String myString = in.nextLine();

        // convert myString into character array to loop through //
        char[] charactersInString = myString.toCharArray();

        for (char chr : charactersInString)
        {
            if (countingMap.containsKey(chr))
            {
                // hashmap.get(key) accesses/gets the value //
                countingMap.put(chr, countingMap.get(chr) + 1);
            }
            else
            {
                countingMap.put(chr, 1);

            }

        }
        for (Map.Entry<Character, Integer> output : countingMap.entrySet()) {
            System.out.println(output.getKey() + ": " + output.getValue());
        }

    }

}
