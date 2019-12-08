package exercises.String_Programs;

import java.util.HashMap;
import java.util.Map;

public class MapEntryForGetKeyAndGetValueContainsKeyPutGet_Duplicate_chars_in_String {
    public static void main(String[] args) {

        String str = "DuplicateCharacters.com";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // if map has key, add increase value by 1 else put 1
        for (int i=0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }

            else {
                map.put(str.charAt(i), 1);
            }
        }
        // System.out.println(map); Output =
        // {a=3, c=3, C=1, D=1, e=2, h=1, i=1, l=1, m=1, .=1, o=1, p=1, r=2, s=1, t=2, u=1}
        // use Map.Entry for iterating through key and value pairs
        // iterate through map with Map.EntrySet() to get both keys and values
        for (Map.Entry<Character, Integer> entry: map.entrySet())  {
            if (entry.getValue() > 1) {
                System.out.println("Character " + entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
