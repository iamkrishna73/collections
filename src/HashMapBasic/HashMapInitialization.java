package HashMapBasic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
    public static Map<String, Integer> marksMap;
    static {
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }
    public static void main(String [] args){
        // 1. Using HashMap class
        HashMap<String , Integer>  map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        //2. static ways : static hashmap:
        System.out.println(HashMapInitialization.marksMap.get("A"));

        //3. immutable with only one single entry:
        Map<String, Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
        //map3.put("abc", 200); //UnsupportedOperationException

        //4. JDK 8:
        // create one 2D array of String using Stream and collecting in the form Map
        Map<String, String> map4 = Stream.of(new String [][]{
                {"Tom", "A Grade"},
                {"Naveen", "A+ Grade"}
        }).collect(Collectors.toMap(data-> data[0], data -> data[1]));

        System.out.println(map4.get("Tom"));
        map4.put("Lisa", "A++ Grade");
        System.out.println(map4.get("Lisa"));

        //using SimpleEntry:







    }
}
