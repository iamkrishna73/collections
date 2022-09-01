package SetCollection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetBasic {
    public static void main(String[] args){
        LinkedHashSet set1 = new LinkedHashSet(10);
        set1.add("paper");
        set1.add("pen");
        set1.add("pap");
        set1.add("paer");
        System.out.println(set1.size());

    }
}
