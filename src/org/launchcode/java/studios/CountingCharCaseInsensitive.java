package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class CountingCharCaseInsensitive
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> countingMap = new HashMap<>();
        String myString1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        String myString = myString1.toLowerCase();
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


