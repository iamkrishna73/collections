package HashMapBasic;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "C++");
        languages.put(3, "C#");
        languages.put(4, "JavaScript");
        languages.put(5, "Python");
        System.out.println("Programming Languages are: "+ languages);

        String value = languages.get(1);
        System.out.println("Value at Index 1: " +value);

        System.out.println("Keys: " + languages.keySet());
        System.out.println("Value: " + languages.values());

        System.out.println("Key/Value mapping:" + languages.entrySet());

        languages.replace(2, "Ruby");
        System.out.println(languages);

        languages.remove(2);
        System.out.println(languages);

    }
}
