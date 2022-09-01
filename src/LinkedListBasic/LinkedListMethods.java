package LinkedListBasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String [] args){
        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.size());

        names.add("Tom");
        names.add("Naveen");
        names.add("Robby");
        names.add("Lisa");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(1));


        Iterator<String> it =  names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        names.add(4, "Steve");
        System.out.println(names);

        names.add(2, "Ram");

        LinkedList<String> users = new LinkedList<>();
        users.add("Peter");
        users.add("Trump");

        names.addAll(users);
        System.out.println(names);

        names.addFirst("Kamala");
        System.out.println(names);

        names.addLast("Shirley");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.removeAll(users);
        System.out.println(names);

        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        names.clear();
        System.out.println(names);

        LinkedList<String> lang = new LinkedList<>();
        System.out.println("Java");
        System.out.println("Python");
        System.out.println("Ruby");
        System.out.println("JavaScript");

        System.out.println(lang.size());
        //reverse the LinkedList;

        var itr = lang.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s: lang){
            System.out.println(s);
        }

        Collections.sort(lang);
        System.out.println(lang );

    }
}
