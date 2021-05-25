package fit.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void listsAndMaps() {
        System.out.println("funny collections...");
        String[] names = new String[] { "Prof", "Emilio", "Murta"};
        System.out.println(Arrays.toString(names));

        System.out.println("Ah, dynamo operator... :)");
        Map<String, String> record = new LinkedHashMap<>() {{
            put("key", "value");
            put("key1", "value1");
            put("key2", "value2");
        }};
        System.out.println("Simple List Record...");
        System.out.println(record);

        Map<String, String> recordAnonymous = new LinkedHashMap<>();
        {
            recordAnonymous.put("key", "value");
            recordAnonymous.put("key1", "value1");
            recordAnonymous.put("key2", "value2");
        }
        System.out.println("anonymous block hashmap");
        System.out.println(recordAnonymous);

        List<Map<String, String>> complexRecord = new ArrayList<>() {{
            add(new LinkedHashMap<>() {{
                put("uglyKey", "uglyValue");
            }});
        }};
        System.out.println("Complex Record ...");
        System.out.println(complexRecord);

        List<Map<String, String>> complexRecordMadeEasy = List.of(
            Map.of("key", "value", "key1", "value1", "key2", "value2")
        );
        System.out.println("fancy list of maps...");
        System.out.println(complexRecordMadeEasy);

        System.out.println("Dealing with maps (dicionaries)...");
        for(Map<String, String> rec : complexRecordMadeEasy) {
            System.out.println("printing all the keys for one record (map)...");
            for(String k : rec.keySet()) {
                System.out.println(k);
            }

            System.out.println("printing all the values for one record (map)...");
            for(String v : rec.values()) {
                System.out.println(v);
            }

            System.out.println("printing all the entries for one record (map)...");
            for(Map.Entry<String, String> entry : rec.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }
}
