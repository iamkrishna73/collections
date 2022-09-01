package com.codewithme;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
    public static void main(String [] args){
        HashSet<String> studentName = new HashSet<>();
        studentName.add("Java");
        studentName.add("C++");
        studentName.add("Python");
        studentName.add("javaScript");
        studentName.add("Ruby");
        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
