package fit.dynamics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dynamics {
    public static void tasteDynamics() {
        System.out.println("VARiables!!!");

        var name = "emilio";
        var number = 10;
        var floating = 10.0f;
        var doubleNumber = 10.0;

        var list = new ArrayList<String>() {
            {
                add("yep, it works...");
            }
        };
        var listMap = new ArrayList<Map<String, String>>() {
            {
                add(new LinkedHashMap<>() {
                    {
                        put("k", "v");
                    }
                });
            }
        };
        var fancyList = List.of("new", "list");
        var fancyMapFromEntrySet = Map.ofEntries(Map.entry("key", "value"), Map.entry("key2", "value2"));

        System.out.println(name);
        System.out.println(list);
        System.out.println(listMap);
        System.out.println(fancyList);
        System.out.println(fancyMapFromEntrySet);

        var o = new Object() {
            public String name = "dynamic emilio";

            public String getName() {
                return this.name;
            }
        };
        System.out.println("Dyamics can be really dynamics!");
        System.out.println(o.name);
        System.out.println(o.getName());

        o.name = "new name!";
        System.out.println(o.getName());
    }
}
