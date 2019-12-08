package exercises.String_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntryIteratorGetKeyGetValueEntrySet_IterateToRemoveKVPairs {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("LC", "LaunchCode");
        map.put("JV", "Java");
        map.put("PY", "Python");

        // using Iterators, remove a key-value pair
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();

            if (entry.getKey() == "LC") {
                iter.remove();
            }
            else {
                System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());

            }

        }

    }
}
