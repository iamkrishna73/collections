package HashMapBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCampare {
    public static void main(String [] args){
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4, "D");

        //1. on the basis of key-value: use equals method:

        System.out.println(map1.equals(map2)); //true
        System.out.println(map2.equals(map1)); //true
        System.out.println(map1.equals(map3)); //false

        //2. campare hashmaps for the same keys: keySet():
        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");

        // combine/Union the keys from both the map: using HashSet:
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        System.out.println("--------");
        //campare map by using value:
        HashMap<Integer, String> map5 = new HashMap<>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");

        HashMap<Integer, String> map6 = new HashMap<>();
        map6.put(1, "A");
        map6.put(2, "B");
        map6.put(3, "C");

        HashMap<Integer, String> map7 = new HashMap<>();
        map7.put(1, "A");
        map7.put(2, "B");
        map7.put(3, "C");
        map7.put(4, "D");

        //1. duplicates are not allowed: using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map5.values())));//true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false

        System.out.println("---------");
        //2. duplicates are allowed: using ArrayList
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
        System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map5.values())));//true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
    }
}
