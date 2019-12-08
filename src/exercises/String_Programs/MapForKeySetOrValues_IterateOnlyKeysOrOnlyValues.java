package exercises.String_Programs;

import java.util.HashMap;
import java.util.Map;

public class MapForKeySetOrValues_IterateOnlyKeysOrOnlyValues {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("LC", "LaunchCode");
        map.put("JV", "Java");
        map.put("PY", "Python");
        // iterate over keys only
        for (String name : map.keySet()) {
            System.out.println(name);
        }

        // iterate over values only
        for (String val : map.values()) {
            System.out.println(val);
        }
    }
}

