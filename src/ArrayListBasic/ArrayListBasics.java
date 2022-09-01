package ArrayListBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasics {
    public static void main(String[] args){
        ArrayList<String> fruitName = new ArrayList<>();
        fruitName.add("Mango");
        fruitName.add("date");
        fruitName.add("Banana");
        fruitName.add("Grapes");
        fruitName.add("Apple");

        fruitName.set(1, "Orange");

        System.out.println(fruitName);
        System.out.println("---------");
        fruitName.forEach(System.out::println);
        System.out.println("--------------");

        Iterator<String> it = fruitName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ArrayList<String> fruitName2 = new ArrayList<>();
        fruitName2.add("Mango");
        fruitName2.add("mike");

        System.out.println("----------");
        fruitName.retainAll(fruitName2);

        System.out.println(fruitName);



    }
}

