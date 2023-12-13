import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class _00_14_Map {
    public static void main(String[]args) {
        Map <String, String> d = new HashMap<>();
        d.put("MO", "MONDAY");
        d.put("TU", "TUESDAY");
        System.out.println(d);
        System.out.println(d.get("TU"));

        if (d.containsKey("MO")) {
            System.out.println(d.get("MO"));
        }
        else {
            System.out.println("???");
        }
        if (d.containsValue("MO")) {
            System.out.println(d.get("MO"));
        }
        else {
            System.out.println("???");
        }

        for (String x : d.keySet()) {
            System.out.println(x);
        }
        for (String x : d.values()) {
            System.out.println(x);
        }
        for (Entry <String, String> x : d.entrySet()) {
            System.out.println(x);
        }

    }
}