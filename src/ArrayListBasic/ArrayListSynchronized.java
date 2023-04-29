package ArrayListBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronized {
    public static void main(String [] args){
        //: Collections.synchronizedList
        List<String> namelist = Collections.synchronizedList(new ArrayList<>());
        namelist.add("Java");
        namelist.add("Python");
        namelist.add("C++");
        // add, remove- we don't need explicit synchronization
        //to fetch/traerse the values from this list -- we have to use explicit synchronization
        synchronized (namelist){
            Iterator<String> it =  namelist.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        System.out.println("----------");
        // 2. copyOnWriteArrayList -- its a class: Thread-safe/synchronized already.
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Krishna");

        // we don't excplicit synchronization for any operation: add/remove/traverse
        Iterator<String> it2 = empList.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
