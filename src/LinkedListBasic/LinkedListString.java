package LinkedListBasic;

import java.util.LinkedList;

public class LinkedListString {
    public static void main(String[] args){
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("my");
        l1.add("name");
        l1.add("is");
        l1.add("Mike");
        System.out.println(l1);
        String[] ss = new String[5];
        l1.toArray(ss);
        for(String element: l1){
            System.out.print(element + " ");
        }
    }
}
