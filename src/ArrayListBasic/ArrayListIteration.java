package ArrayListBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String [] args){
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Mike");
        studentName.add("David");
        studentName.add("steve");
        studentName.add("Tom");
        studentName.add("Kevin");

        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<String> it2 = studentName.listIterator();

        while(it2.hasPrevious()){
            System.out.println(it2.previous());
        }

        System.out.println("Traversing list through for loop");
        for(int i = 0; i < studentName.size(); i++){
            System.out.println(studentName.get(i));
        }

        System.out.println("Traversing list through foreach loop");

        studentName.forEach(a ->{
            System.out.println(a);
        });
    }
}
