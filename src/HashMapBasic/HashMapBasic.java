package HashMapBasic;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasic {
    public static void main(String [] args){
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "Landon");
        capitalMap.put("UK", "Washington DC");
        capitalMap.put(null , "Barlin");
        capitalMap.put(null, "LA");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);

        System.out.println(capitalMap);
        System.out.println("-----------");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("UK"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        //iterator: over the keys: by using keySet()
        Iterator<String> it = capitalMap.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("------");
        // iterator: o ver the set(pair): by using enteySet
       Iterator<Map.Entry<String, String>> it1 =  capitalMap.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<String, String> entry = it1.next();
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
        }
        System.out.println("------");
        //iterate hashMap using java 8 for each and lambda:
        capitalMap.forEach((k, v) -> System.out.println("Kay = " + k + " and value = " + v));

    }
}
