package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;


public class CountingChar
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> countingMap = new HashMap<>();
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // convert myString into character array to loop through //
        char[] charactersInString = myString.toCharArray();

        for (char chr : charactersInString)
        {
            // containsKey(key) returns a boolean //
            if (countingMap.containsKey(chr))
            {
                /* if key/value pair exists in countingMap,
                get(key) accesses/gets the value from hashmap
                 */
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


